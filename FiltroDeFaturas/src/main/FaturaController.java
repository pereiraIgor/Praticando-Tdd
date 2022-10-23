package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FaturaController {

    private List<Fatura> listaFaturas;

    public FaturaController() {
        this.listaFaturas = new ArrayList<>();
    }

    public List<Fatura> getListaDeFaturas() {
        return this.listaFaturas;
    }

    public void adicionaFatura(Fatura fatura) {
        this.listaFaturas.add(fatura);
    }
}
