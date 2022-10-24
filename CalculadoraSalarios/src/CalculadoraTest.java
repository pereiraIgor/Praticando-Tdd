import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void criarCalculadora(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 0, "DESENVOLVEDOR");
        Calculadora calc = new Calculadora(func);
        assertEquals(0, func.getSalarioCalculado(), 0);
    }
}
