package main;

public class Cliente {
    private String dataInclusao;
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataInclusao() {
        return "03/06/2018 00:00";
    }
}
