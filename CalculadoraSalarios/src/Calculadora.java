public class Calculadora {
    public double getSalarioCalculado(Funcionario funcionario){
        if(funcionario.getCargo() == "DESENVOLVEDOR"){
            if(funcionario.getSalarioBase() >= 3000){
                return funcionario.getSalarioBase() * (.8);
            }
            return funcionario.getSalarioBase() * (.9);
        }else if(funcionario.getCargo() == "DBA"){
            return funcionario.getSalarioBase() * (0.75);
        }
        return funcionario.getSalarioBase();
    }
}
