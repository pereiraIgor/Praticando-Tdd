package tests;

import main.Cliente;
import main.Fatura;
import main.FaturaController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        Cliente c = new Cliente("Cliente", "14/04/2010 00:00", "AM");
        fc.adicionaFatura(c, new Fatura(7, 1000, "20/10/2022 00:00"));
        assertEquals(1, fc.getListaDeFaturas().size());
    }

    @Test
    public void testFaturaEstaAssociadaACliente(){
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "14/04/2010 00:00", "AM");
        fc.adicionaFatura(c, new Fatura(1, 1000, "20/10/2022 00:00"));
        assertTrue(c.checaSeTemFatura(1));
    }

    @Test
    public void testFaturaControllerFiltroFaturasMenor2000(){
        FaturaController fc = new FaturaController();
        Cliente c = new Cliente("Cliente", "14/04/2010 00:00", "AM");
        fc.adicionaFatura(c, new Fatura(1, 2500, "20/10/2022 00:00"));
        fc.filtraFaturas();
        assertTrue(fc.getListaDeFaturas().get(c).getValorFatura() < 2000);
    }
}
