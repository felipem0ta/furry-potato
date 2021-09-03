package br.com.digitalinnovation.calendars;

import java.util.Calendar;

public class ExemploCalendario {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("A data corrente é: "+ agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " +agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: "+ agora.getTime());

        agora.add(Calendar.YEAR, 1);
        System.out.println("1 ano depois: "+ agora.getTime());
    }
}
