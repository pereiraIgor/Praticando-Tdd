public class Funcionario {
    String nome;
    String email;
    double salárioBase ;
    String cargo;
    public Funcionario(String nome, String email, double salárioBase ,String cargo){
        this.nome = nome;
        this.email = email;
        this.salárioBase = salárioBase;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }
}
