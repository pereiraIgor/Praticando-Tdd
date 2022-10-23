package tests;

import main.Cliente;
import main.Fatura;
import main.ClienteController;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteControllerTest {


    @Test
    public void testClienteControllerSemFaturas(){
        ClienteController cc = new ClienteController();
        assertEquals(0, cc.getClientes().size());
    }

    @Test
    public void testClienteControllerFaturaAssociadaACliente(){
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 1", "2010-04-14", "AM");
        cc.adicionaFatura(c, new Fatura(1, 1000, "2022-10-20"));
        assertEquals(1, cc.getListaDeFaturas().size());
    }

    @Test
    public void testFaturaEstaAssociadaACliente(){
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 2", "2010-04-14", "AM");
        cc.adicionaFatura(c, new Fatura(2, 1000, "2022-10-20"));
        assertTrue(c.checaSeTemFatura(2));
    }

    @Test
    public void testFaturaCadastradasCorretamente(){
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 2", "2010-04-14", "AM");
        cc.adicionaFatura(c, new Fatura(2, 1000, "2022-10-20"));
        assertTrue(c.checaSeTemFatura(2));
        assertEquals(1, cc.getListaDeFaturas().size());
    }

    @Test
    public void testClienteControllerFiltroFaturasMenor2000() throws ParseException {
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 3", "2010-04-14", "AM");
        Fatura f = new Fatura(3, 1900, "2022-10-20");
        cc.adicionaFatura(c, f);
        cc.filtraFaturas();
        assertEquals(0, cc.getListaDeFaturas().size());
    }

    @Test
    public void testClienteControllerFiltroFaturas2000_2500() throws ParseException {
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "AM");
        Fatura f1 = new Fatura(4, 2400, "2022-10-15");
        Fatura f2 = new Fatura(5, 2200, "2022-03-15");
        cc.adicionaFatura(c, f1);
        cc.adicionaFatura(c, f2);
        cc.filtraFaturas();
        assertEquals(1, cc.getListaDeFaturas().size());
        assertFalse(cc.getCliente(c.getNome()).checaSeTemFatura(f1.getCodigo()));
        assertTrue(cc.getCliente(c.getNome()).checaSeTemFatura(f2.getCodigo()));
    }

    @Test
    public void testClienteControllerFiltroFaturas2500_3000() throws ParseException {
        ClienteController cc = new ClienteController();
        Cliente c = new Cliente("Cliente 5", "2010-04-14", "AM");
        Fatura f1 = new Fatura(6, 2700, "2022-10-15");
        Fatura f2 = new Fatura(7, 2900, "2022-09-10");
        cc.adicionaFatura(c, f1);
        cc.adicionaFatura(c, f2);
        cc.filtraFaturas();
        assertEquals(0, cc.getListaDeFaturas().size());
        assertFalse(cc.getCliente(c.getNome()).checaSeTemFatura(f1.getCodigo()));
        assertFalse(cc.getCliente(c.getNome()).checaSeTemFatura(f2.getCodigo()));
    }
}
