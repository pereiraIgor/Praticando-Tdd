package main.Controller;

import main.Model.Cliente;
import main.Model.Fatura;

import java.util.*;

public class ClienteController {

    private Map<String, Cliente> clientes;


    public ClienteController() {
        this.clientes = new HashMap<>();
    }

    public Map<String, Cliente> getClientes() {
        return this.clientes;
    }

    public void adicionaFatura(Cliente cliente, Fatura fatura) {
        this.clientes.put(cliente.getNome(), cliente);
        cliente.adicionaFatura(fatura);
    }




    @Override
    public String toString() {
        String res = "Faturas" + System.lineSeparator() + "/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/" + System.lineSeparator();
        for (Cliente c: this.clientes.values()) {
            res += c.toString() + System.lineSeparator();
            for (Fatura f: c.getListaFaturas()){
                res += f.toString() + System.lineSeparator();
                res += "/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/=/";
            }

        }
        return res;
    }

    public List<Fatura> getListaDeFaturas() {
        List<Fatura> faturasCliente = new ArrayList<>();
        for (Cliente c: this.clientes.values()){
            faturasCliente.addAll(c.getListaFaturas());
        }
        return faturasCliente;
    }

    public void filtraFaturas() {
        for(Cliente c: this.clientes.values()){
            c.filtraFaturas();
        }
    }

    public Cliente getCliente(String nomeCliente) {
        return this.clientes.get(nomeCliente);
    }
}
