package tests;

import main.Cliente;
import main.Fatura;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

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
        Fatura f = new Fatura(3, 1000, "20/10/2022 00:00");
        assertEquals("20/10/2022 00:00", f.getDataFatura());
    }

    @Test
    public void testClienteContemFatura() {
        Fatura f = new Fatura(4, 1000, "20/10/2022 00:00");
        Cliente c = new Cliente("Cliente 4", "14/04/2010 00:00", "AM");
        c.adicionaFatura(f);
        assertTrue(c.checaSeTemFatura(4));
    }

    @Test
    public void testClienteContemFaturaDiferente() {
        Fatura f = new Fatura(7, 1000, "20/10/2022 00:00");
        Cliente c = new Cliente("Cliente 4", "14/04/2010 00:00", "AM");
        c.adicionaFatura(f);
        assertTrue(c.checaSeTemFatura(7));
    }
}
