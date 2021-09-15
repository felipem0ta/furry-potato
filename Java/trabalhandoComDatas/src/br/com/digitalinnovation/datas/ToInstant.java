package br.com.digitalinnovation.datas;
import java.util.Date;
import java.time.Instant;

public class ToInstant {
    public static void main(String[] args) {
        Date dataInicio = new Date();
        System.out.println("Construtor padrão: "+dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println("Implementado toInstant: "+instant);
    }
}
