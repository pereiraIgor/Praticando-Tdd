package main;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dataInclusao;
    private String nome;

    private String estado;
    private List<Fatura> listaFaturas;

    public Cliente(String nome, String dataInclusao, String estado){
        this.nome = nome;
        this.dataInclusao = dataInclusao;
        this.estado = estado;
        this.listaFaturas = new ArrayList<>();
        listaFaturas.add(new Fatura(3, 1000, "20/10/2022 00:00"));
        listaFaturas.add(new Fatura(4, 1000, "20/10/2022 00:00"));
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

    public boolean checaSeTemFatura(int codigo) {
        for (Fatura f:this.listaFaturas) {
            if(f.getCodigo() == codigo){
                return true;
            }

        }
        return false;
    }
}
