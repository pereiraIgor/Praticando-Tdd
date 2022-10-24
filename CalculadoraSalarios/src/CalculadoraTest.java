import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void criarCalculadora(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 0, "DESENVOLVEDOR");
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.getSalarioCalculado(func), 0);
    }
    @Test
    public void criarCalculadoraDev(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 2999, "DESENVOLVEDOR");
        Calculadora calc = new Calculadora();
        assertEquals(2699.1, calc.getSalarioCalculado(func), 0);
    }
    @Test
    public void criarCalculadoraDev2(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 3000, "DESENVOLVEDOR");
        Calculadora calc = new Calculadora();
        assertEquals(2400, calc.getSalarioCalculado(func), 0);
    }
    @Test
    public void criarCalculadoraDda(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 3000, "DBA");
        Calculadora calc = new Calculadora();
        assertEquals(2250, calc.getSalarioCalculado(func), 0);
    }
    @Test
    public void criarCalculadoraDda2(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 1999, "DBA");
        Calculadora calc = new Calculadora();
        assertEquals(1699, calc.getSalarioCalculado(func), .5);
    }
    @Test
    public void criarCalculadoraTeste(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 0, "TESTADOR");
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.getSalarioCalculado(func), .5);
    }
    @Test
    public void criarCalculadoraTeste2(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 1999, "TESTADOR");
        Calculadora calc = new Calculadora();
        assertEquals(1699, calc.getSalarioCalculado(func), .5);
    }
    @Test
    public void criarCalculadoraGerente(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 0, "GERENTE");
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.getSalarioCalculado(func), .5);
    }
    @Test
    public void criarCalculadoraGerente2(){
        Funcionario func = new Funcionario("Func1", "func.teste@teste", 5000, "GERENTE");
        Calculadora calc = new Calculadora();
        assertEquals(3750, calc.getSalarioCalculado(func), .5);
    }
    
}
