package tests;

import main.Fatura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FaturaTest {


    @Test
    public void testFaturaContemCodigo(){
        Fatura f = new Fatura(1);
        assertEquals(1, f.getCodigo());
    }
}
