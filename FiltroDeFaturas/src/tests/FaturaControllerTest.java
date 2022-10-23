package tests;

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
    public void testFiltraFaturaController(){
        FaturaController fc = new FaturaController();
        fc.adicionaFatura(new Fatura(7, 1000, "20/10/2022 00:00"));
        assertEquals(1, fc.getListaDeFaturas().size());
    }
}
