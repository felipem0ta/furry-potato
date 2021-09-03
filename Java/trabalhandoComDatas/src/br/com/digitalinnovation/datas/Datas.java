package br.com.digitalinnovation.datas;

import java.util.Date;

public class Datas {

    public static void main(String[] args) {
        Date novaData = new Date();
        System.out.println("Contrutor padrão da classe Date: "+novaData);

        //Date usando Epoch
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date epochData = new Date(currentTimeMillis);
        System.out.println("Construtor usando UNIX Epoch: "+epochData);

        //Métodos úteis
        Date dataNoPassado = new Date(1530499798716l);
        System.out.println("Data no Passado: "+dataNoPassado);
        Date dataNoFuturo = new Date(2030499798716l);
        Date mesmaDataNoFuturo = new Date(2030499798716l);
        System.out.println("Data no Futuro: "+dataNoFuturo);
        System.out.println("Mesma Data no Futuro: "+mesmaDataNoFuturo);
        /**Comparando se dataNoFuturo é posterior a dataNoPassado */

        boolean isAfter = dataNoFuturo.after(dataNoPassado);
        System.out.println(isAfter);
        /**Comparando se dataNoPassado é anterior a dataNoFuturo */
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        System.out.println(isBefore);

        /**Comparando se as datas são iguais*/
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println("São iguais? "+isEquals);

        /**Comparando datas diferentes*/

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //tempos equivalentes

        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);
    }
}
