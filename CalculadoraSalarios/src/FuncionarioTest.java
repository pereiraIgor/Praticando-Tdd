import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionarioTest {
   @Test
   public void testFuncPossuiNome(){
        // nome, e-mail, salário-base e cargo.
        Funcionario func = new Funcionario("Igor", "igo.per@",2000.0, "DBA");
        assertEquals("Igor", func.getNome());
   }

   @Test
   public void testFuncNomeDiferente(){
      Funcionario func2 = new Funcionario("Funcionario","", 0, null);
      assertEquals("Funcionario", func2.getNome());
   }

   @Test
   public void testFuncPossuiEmail(){
      Funcionario func = new Funcionario("", "func.1@teste.com", 0, "");
      assertEquals("func.1@teste.com", func.getEmail());
   }
   @Test
   public void testFuncPossuiEmailDiferente(){
      Funcionario func2 = new Funcionario("", "func.2@teste2.com", 0, "");
      assertEquals("func.2@teste2.com", func2.getEmail());
   }
   @Test
   public void testFuncPossuiSalarioBase(){
      Funcionario func = new Funcionario("funcionario1", "func.1@teste.com", 2000.0, "");
      assertEquals(2000, func.getSalarioBase(), 0);
   }
   @Test
   public void testFuncPossuiSalarioBaseDiferente(){
      Funcionario func2 = new Funcionario("funcionario1", "func.1@teste.com", 3500.5, "");
      assertEquals(3500.5, func2.getSalarioBase(), 0);
   }
   @Test
   public void testFuncPossuiCargo(){
      Funcionario func = new Funcionario("funcionario1", "func.1@teste.com", 2000.0, "DBA");
      assertEquals("DBA", func.getCargo());
   }
   @Test
   public void testFuncPossuiCargoDiferente(){
      Funcionario func2 = new Funcionario("funcionario1", "func.1@teste.com", 2000.0, "DESENVOLVEDOR");
      assertEquals("DESENVOLVEDOR", func2.getCargo());
   }
   @Test
   public void testDevSalarioLiquido(){
      Funcionario dev = new Funcionario("Funcionario 1", "func.1@teste", 3500, "DESENVOLVEDOR");
      assertEquals(2800, dev.getSalarioLiquido(), 0);
   }
}
