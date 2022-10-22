import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class FuncionarioTest {
   @Test
   public void testFuncPossuiNome(){
        // nome, e-mail, salário-base e cargo.
        Funcionario func = new Funcionario("Igor", "igo.per@",2000.0, "DBA");
        assertEquals("Igor", func.getnome());
   }
}
