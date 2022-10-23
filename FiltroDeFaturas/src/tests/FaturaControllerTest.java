package tests;

import main.Cliente;
import main.Fatura;
import main.FaturaController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

public class FaturaControllerTest {


    @Test
    public void testFaturaControllerSemFaturas(){
        FaturaController fc = new FaturaController();
        assertEquals(0, fc.getListaDeFaturas().size());
    }

    @Test
    public void testFaturaControllerFaturaAssociadaACliente(){
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "2010-04-14", "AM");
        fc.adicionaFatura(c, new Fatura(7, 1000, "2022-10-20"));
        assertEquals(1, fc.getListaDeFaturas().size());
    }

    @Test
    public void testFaturaEstaAssociadaACliente(){
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "2010-04-14", "AM");
        fc.adicionaFatura(c, new Fatura(1, 1000, "2022-10-20"));
        assertTrue(c.checaSeTemFatura(1));
    }

    @Test
    public void testFaturaControllerFiltroFaturasMenor2000() throws ParseException {
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "2010-04-14", "AM");
        fc.adicionaFatura(c, new Fatura(1, 1900, "2022-10-20"));
        fc.filtraFaturas();
        assertEquals(0, fc.getListaDeFaturas().size());
    }

    @Test
    public void testFaturaControllerFiltroFaturas2000_2500() throws ParseException {
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "2010-04-14", "AM");
        Fatura f1 = new Fatura(1, 2500, "2022-10-15");
        Fatura f2 = new Fatura(1, 2200, "2022-03-15");
        fc.adicionaFatura(c, f1);
        fc.adicionaFatura(c, f2);
        fc.filtraFaturas();
        assertEquals(1, fc.getListaDeFaturas().size());
        assertEquals(f2, fc.getFatura(f2));
    }
}
