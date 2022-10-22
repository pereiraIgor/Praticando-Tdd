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
   
}
