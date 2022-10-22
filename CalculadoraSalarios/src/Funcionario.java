public class Funcionario {
    String nome;
    String email;
    double salarioBase ;
    String cargo;
    public Funcionario(String nome, String email, double salarioBase ,String cargo){
        this.nome = nome;
        this.email = email;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public double getSalarioBase(){
        return this.salarioBase;
    }
    public String getCargo(){
        return this.cargo;
    }
}
