package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public void filtraFaturas() throws ParseException {
        LocalDateTime now = LocalDateTime.now();
        List<Fatura> faturasParaRemover = new ArrayList<>();
        for (Cliente c:this.faturas.keySet()) {
            Fatura f = this.faturas.get(c);
            if(f.getValorFatura() < 2000){
                faturasParaRemover.add(f);
            }
            else if(f.getValorFatura() >= 2000 && f.getValorFatura() < 2500){
                LocalDate myDate = LocalDate.parse(f.getDataFatura());
                if(myDate.getYear() == now.getYear()) {
                    if((now.getDayOfYear() - myDate.getDayOfYear()) <= 30){
                        faturasParaRemover.add(f);
                    }
                }
            }
        }
        this.removeFaturas(faturasParaRemover);

    }

    private void removeFaturas(List<Fatura> faturasParaRemover){
        for (Cliente c:this.faturas.keySet()) {
            Fatura f = this.faturas.get(c);
            if(faturasParaRemover.contains(f)){
                this.faturas.remove(c,f);
            }
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
