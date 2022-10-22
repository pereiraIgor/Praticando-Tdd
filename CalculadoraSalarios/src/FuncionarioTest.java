import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionarioTest {
   @Test
   public void testFuncPossuiNome(){
        // nome, e-mail, salário-base e cargo.
        Funcionario func = new Funcionario("Igor", "igo.per@",2000.0, "DBA");
        assertEquals("Igor", func.getNome());
   }
}
