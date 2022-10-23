package tests;

import main.Model.Cliente;

import org.junit.jupiter.api.Test;


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
        Cliente c = new Cliente("Cliente 3", "2018-03-06", "");
        assertEquals("2018-03-06", c.getDataInclusao());
    }

    @Test
    public void testClientePossuiDataDiferente(){
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "");
        assertEquals("2010-04-14", c.getDataInclusao());
    }

    @Test
    public void testClientePossuiEstado(){
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "PB");
        assertEquals("PB", c.getEstado());
    }

    @Test
    public void testClientePossuiEstadoDiferente(){
        Cliente c = new Cliente("Cliente 4", "2010-04-14", "AM");
        assertEquals("AM", c.getEstado());
    }
}
