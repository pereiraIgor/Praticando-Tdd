package main;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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
        return this.dataFatura;
    }


    @Override
    public String toString() {
        return "Fatura" + System.lineSeparator() +
                "Codigo: " + codigo + System.lineSeparator() +
                "Data da Fatura: " + dataFatura + System.lineSeparator() +
                "Valor da Fatura: " + valor + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fatura fatura = (Fatura) o;
        return codigo == fatura.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
