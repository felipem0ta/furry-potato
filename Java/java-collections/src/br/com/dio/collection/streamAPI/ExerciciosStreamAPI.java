package br.com.dio.collection.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String:");
        numerosAleatorios.stream().forEach(
                System.out::println
        );
        System.out.println();

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        numerosAleatorios.stream()
                .limit(5) //limita a leitura da Stream
                .collect(Collectors.toSet()) //Colete os elementos dessa lista e coloque em outro lugar
                .forEach(System.out::println); //Imprima a lista resultante do Collectors
        System.out.println();

        System.out.println("Transforme essa lista de String em uma lista de Integer:");
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt) //Retorna Stream, o método Parse transforma os elementos no tipo referenciado.
                .collect(Collectors.toList()); //Coleta os elementos da Stream e põe numa List
        System.out.println(numerosAleatorios1 +"\n");

        System.out.println("Pegue os números pares maiores que 2 e coloque numa List:");
         List<Integer> paresMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)//Retorna um Stream de Integer
                .filter(integer -> integer % 2 == 0 && integer > 2) //Filtra a Stream com uma funçao anonima
                .collect(Collectors.toList()); // Coleta e poe numa lista
        System.out.println(paresMaioresQue2 +"\n");

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()// Como retorna um Optional, é preciso usar o ifPresent
                .ifPresent(System.out::println);

        System.out.println("Remova os números impares:");
        numerosAleatorios1.removeIf( i -> i%2 !=0); //A essa altura do código, numerosAleatorios1 já é uma lista de Integer, isso possibilita o uso do método .removeIf
        System.out.println(numerosAleatorios1+"\n");

    }
}
