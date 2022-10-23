package main;

import java.util.*;

public class FaturaController {

    private Map<Cliente, Fatura> faturas;

    public FaturaController() {
        this.faturas = new HashMap<>();
    }

    public Map<Cliente, Fatura> getListaDeFaturas() {
        return this.faturas;
    }

    public void adicionaFatura(Cliente cliente,Fatura fatura) {
        cliente.adicionaFatura(fatura);
        this.faturas.put(cliente, fatura);

    }

    public void filtraFaturas() {
        for (Cliente c:this.faturas.keySet()) {
            this.faturas.remove(c);
        }
    }

    @Override
    public String toString() {
        String res = "Faturas" + System.lineSeparator() + "/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/" + System.lineSeparator();
        for (Fatura f: this.faturas.values()) {
            res += f.toString() + System.lineSeparator();
            res += "/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/";
        }
        return res;
    }

    public Fatura getFatura(Fatura fatura) {
        for (Fatura f:this.faturas.values()) {
            if(f.getCodigo() == fatura.getCodigo()){
                return f;
            }

        }
        return null;
    }
}
