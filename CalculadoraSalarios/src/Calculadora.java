public class Calculadora {
    public double getSalarioCalculado(Funcionario funcionario){
        if(funcionario.getCargo() == "DESENVOLVEDOR"){
            if(funcionario.getSalarioBase() >= 3000){
                return funcionario.getSalarioBase() * (.8);
            }
            return funcionario.getSalarioBase() * (.9);
        }
        return funcionario.getSalarioBase();
    }
}
