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
   public void testFuncPossuiSalarioBase(){
      Funcionario func = new Funcionario("funcionario1", "func.1@teste.com", 2000.0, "");
      assertEquals(2000, func.getSalarioBase(), 0);
   }
}
