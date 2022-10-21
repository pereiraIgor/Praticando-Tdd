package tests;

import main.Cliente;
import main.Fatura;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    public void testClientePossuiNome(){
        Cliente c = new Cliente("Cliente 1", "", "");
        assertEquals("Cliente 1", c.getNome());
    }

    @Test
    public void testClientePossuiNomeDiferente(){
        Cliente c = new Cliente("Cliente 2", "", "");
        assertEquals("Cliente 2", c.getNome());
    }

    @Test
    public void testClientePossuiDataInclusao(){
        Cliente c = new Cliente("Cliente 3", "03/06/2018 00:00", "");
        assertEquals("03/06/2018 00:00", c.getDataInclusao());
    }

    @Test
    public void testClientePossuiDataDiferente(){
        Cliente c = new Cliente("Cliente 4", "14/04/2010 00:00", "");
        assertEquals("14/04/2010 00:00", c.getDataInclusao());
    }

    @Test
    public void testClientePossuiEstado(){
        Cliente c = new Cliente("Cliente 4", "14/04/2010 00:00", "PB");
        assertEquals("PB", c.getEstado());
    }

    @Test
    public void testClientePossuiEstadoDiferente(){
        Cliente c = new Cliente("Cliente 4", "14/04/2010 00:00", "AM");
        assertEquals("AM", c.getEstado());
    }
}
