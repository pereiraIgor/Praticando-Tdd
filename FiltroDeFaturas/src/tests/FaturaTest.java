package tests;

import main.Cliente;
import main.Fatura;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class FaturaTest {


    @Test
    public void testFaturaContemCodigo(){
        Fatura f = new Fatura(1, 1000, "");
        assertEquals(1, f.getCodigo());
    }

    @Test
    public void testFaturaContemValor() {
        Fatura f = new Fatura(2, 1000, "");
        assertEquals(1000, f.getValorFatura());
    }

    @Test
    public void testFaturaContemData() {
        Fatura f = new Fatura(3, 1000, "2022-10-20");
        assertEquals("2022-10-20", f.getDataFatura());
    }

    @Test
    public void testClienteContemFatura() {
        Fatura f = new Fatura(4, 1000, "2022-10-20");
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "AM");
        c.adicionaFatura(f);
        assertTrue(c.checaSeTemFatura(4));
    }

    @Test
    public void testClienteContemFaturaDiferente() {
        Fatura f = new Fatura(7, 1000, "2022-10-20");
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "AM");
        c.adicionaFatura(f);
        assertTrue(c.checaSeTemFatura(7));
    }
}
