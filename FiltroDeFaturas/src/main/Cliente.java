package main;

public class Cliente {
    private String dataInclusao;
    private String nome;

    public Cliente(String nome, String dataInclusao){
        this.nome = nome;
        this.dataInclusao = dataInclusao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataInclusao() {
        return this.dataInclusao;
    }
}
