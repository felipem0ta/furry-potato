package br.com.digitalinnovation.one;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornadobro = v -> v*2;
        System.out.println(retornadobro.apply(valor)); //retorna o dobro de valor
        System.out.println(valor); //valor original não é alterado
    }
}
