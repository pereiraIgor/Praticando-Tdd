public class Calculadora {
    public double getSalarioCalculado(Funcionario funcionario){
        if(funcionario.getCargo() == "DESENVOLVEDOR"){
            if(funcionario.getSalarioBase() >= 3000){
                return funcionario.getSalarioBase() * (.8);
            }
            return funcionario.getSalarioBase() * (.9);
        }else if(funcionario.getCargo() == "DBA" || funcionario.getCargo() == "TESTADOR"){
            if(funcionario.getSalarioBase() >= 2000){
                return funcionario.getSalarioBase() * (0.75);
            }
            return funcionario.getSalarioBase() * (0.85);
        }
        return funcionario.getSalarioBase();
    }
}
