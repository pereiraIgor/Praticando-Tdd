package main;

import java.util.Calendar;
import java.util.Date;

public class Fatura {
    private String dataFatura;
    private double valor;
    private int codigo;

    public Fatura(int codigo, double valor, String data) {
        this.dataFatura = data;
        this.codigo = codigo;
        this.valor = valor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public double getValorFatura() {
        return this.valor;
    }

    public String getDataFatura() {
        return "";
    }
}
