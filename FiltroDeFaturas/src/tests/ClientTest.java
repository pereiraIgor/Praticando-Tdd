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
        Cliente c = new Cliente();
        assertEquals("Cliente 1", c.getNome());
    }
}
