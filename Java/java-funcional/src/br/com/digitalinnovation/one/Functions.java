package br.com.digitalinnovation.one;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, String> inverteNome = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteger = string -> Integer.valueOf(string);
        System.out.println(inverteNome.apply("Felipe"));
        System.out.println(converteStringParaInteger.apply("35"));
    }
}
