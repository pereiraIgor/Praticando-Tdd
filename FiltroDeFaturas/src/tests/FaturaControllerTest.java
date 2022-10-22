package tests;

import main.Fatura;
import main.FaturaController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FaturaControllerTest {

    @Test
    public void testFiltraFaturaController(){
        FaturaController fc = new FaturaController();
        fc.filtraFaturas();
        assertEquals(0, fc.getListaDeFaturas().size());


    }
}
