package main.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Fatura> getListaFaturas() {
        return listaFaturas;
    }

    public boolean checaSeTemFatura(int codigo) {
        for (Fatura f:this.listaFaturas) {
            if(f.getCodigo() == codigo){
                return true;
            }

        }
        return false;
    }

    public void adicionaFatura(Fatura f) {
        this.listaFaturas.add(f);
    }

    public void removeFatura(Fatura f) {
        this.listaFaturas.remove(f);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public void filtraFaturas() {
        LocalDate dataAtual = LocalDate.now();
        List<Fatura> faturasParaRemover = new ArrayList<>();
        for (Fatura f: this.listaFaturas){

            LocalDate dataFatura = LocalDate.parse(f.getDataFatura());
            if(f.getValorFatura() < 2000){
                faturasParaRemover.add(f);
            }else if(f.getValorFatura() >= 2000 && f.getValorFatura() < 2500){
                if(dataAtual.getYear() == dataFatura.getYear() && checaIntervaloData(dataAtual, dataFatura) <= 30){
                    faturasParaRemover.add(f);
                }
            }else if(f.getValorFatura() >= 2500 && f.getValorFatura() < 3000){
                if(dataAtual.getYear() == dataFatura.getYear() && checaIntervaloData(dataAtual, dataFatura) <= 60){
                    faturasParaRemover.add(f);
                }
            }else if(f.getValorFatura() > 4000){
                if(checaEstadoEhDoSul(this.estado)){
                    faturasParaRemover.add(f);
                }
            }
        }
        this.removeFaturas(faturasParaRemover);
    }

    private void removeFaturas(List<Fatura> faturasParaRemover){
        for (Fatura f: faturasParaRemover){
            if (this.listaFaturas.contains(f)){
                this.removeFatura(f);
            }
        }
    }

    private int checaIntervaloData(LocalDate dataAtual, LocalDate dataFatura){
        return dataAtual.getDayOfYear() - dataFatura.getDayOfYear();
    }

    private boolean checaEstadoEhDoSul(String estado){
        if(estado.equals("RS") || estado.equals("SC") || estado.equals("PR")){
            return true;
        }
        return false;
    }

}
