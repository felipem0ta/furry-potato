package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        List<MeioAmbiente> tempMensal = new ArrayList<>(){{
            add(new MeioAmbiente("1 - Janeiro", 31.2d));
            add(new MeioAmbiente("2 - Fevereiro", 30.9d));
            add(new MeioAmbiente("3 - Março", 31.5d));
            add(new MeioAmbiente("4 - Abril", 32.1d));
            add(new MeioAmbiente("5 - Maio", 29.3d));
            add(new MeioAmbiente("6 - Junho", 28.7d));
        }};

        System.out.println("Temperatura nos últimos 6 meses: "+ + '\n' +tempMensal);
        System.out.println("Média nos últimos 6 meses: "+ + '\n' +mediaTemp(tempMensal));


    }

    static Double mediaTemp(List<MeioAmbiente> lista){
        Double media =0d;
        for (int i = 0; i < lista.size(); i++) {
            media += lista.get(i).getTemp();
        }
        media = media/6;
        return media;
    }
}

class MeioAmbiente{
    private String mes;
    private Double temp;

    public MeioAmbiente(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "MeioAmbiente{" +
                "mes='" + mes + '\'' +
                ", temp=" + temp  +
                '}' + '\n';
    }
}

class ComparatorTemp implements Comparator<MeioAmbiente>{

    @Override
    public int compare(MeioAmbiente m1, MeioAmbiente m2) {
        return m1.getTemp().compareTo(m2.getTemp());
    }


}

