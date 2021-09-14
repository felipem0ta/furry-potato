package br.com.digitalinnovation.one;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        Predicate<String> validaVazio = valor -> valor.isEmpty();
        System.out.println(validaVazio.test(""));
        System.out.println(validaVazio.test("Teste"));
    }
}
