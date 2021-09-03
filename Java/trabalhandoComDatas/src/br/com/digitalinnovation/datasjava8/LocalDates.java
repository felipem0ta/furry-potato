package br.com.digitalinnovation.datasjava8;

import java.time.LocalDate;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(ontem);


    }
}
