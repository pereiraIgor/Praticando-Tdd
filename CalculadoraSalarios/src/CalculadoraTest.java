import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void criarCalculadora(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 0, "DESENVOLVEDOR");
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.getSalarioCalculado(func), 0);
    }
}
