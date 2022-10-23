package main.Util;

import java.time.LocalDate;

public class Utils {

    public static int checaIntervaloData(LocalDate dataAtual, LocalDate dataFatura){
        return dataAtual.getDayOfYear() - dataFatura.getDayOfYear();
    }

    public static boolean checaEstadoEhDoSul(String estado){
        if(estado.equals("RS") || estado.equals("SC") || estado.equals("PR")){
            return true;
        }
        return false;
    }

    public static boolean estaoNoMesmoAno(LocalDate dataAtual, LocalDate data){
        return dataAtual.getYear() == data.getYear();
    }
}
