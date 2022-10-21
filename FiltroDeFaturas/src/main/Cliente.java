package main;

public class Cliente {
    private String dataInclusao;
    private String nome;

    private String estado;

    public Cliente(String nome, String dataInclusao, String estado){
        this.nome = nome;
        this.dataInclusao = dataInclusao;
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataInclusao() {
        return this.dataInclusao;
    }

    public String getEstado() {
        return this.estado;
    }

    public int getFaturaCodigo(int i) {
        return 4;
    }
}
