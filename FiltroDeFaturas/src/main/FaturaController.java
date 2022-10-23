package main;

import java.util.*;

public class FaturaController {

    private Map<String, Fatura> faturas;

    public FaturaController() {
        this.faturas = new HashMap<>();
    }

    public Map<String, Fatura> getListaDeFaturas() {
        return this.faturas;
    }

    public void adicionaFatura(Cliente cliente,Fatura fatura) {
        cliente.adicionaFatura(fatura);
        this.faturas.put(cliente.getNome(), fatura);

    }
}
