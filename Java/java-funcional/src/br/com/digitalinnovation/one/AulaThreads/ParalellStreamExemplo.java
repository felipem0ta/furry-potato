package br.com.digitalinnovation.one.AulaThreads;

import java.util.stream.IntStream;

/**
 * ParalellStreamExemplo
 */
public class ParalellStreamExemplo {

    public static void main(String[] args) {
        //SERIAL STREAMING
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 1000000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução serial: "+(fim-inicio));
        
        //PARALLEL STREAM
        inicio = System.currentTimeMillis();
        IntStream.range(1, 1000000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução paralela: "+(fim-inicio));
        
    }

    public static long fatorial(long num) {
        long fat = 1;
        for (long i = 2; i <=num; i++) {
            fat*=i;
        }
        return fat;
    }
}