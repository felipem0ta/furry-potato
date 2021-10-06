package br.com.dio.collection.list;

import java.sql.SQLOutput;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        //List notas = new ArrayList(); // antes do java 5
        //List<Double> notas = new ArrayList<>(); //Generics(jdk5) - diamond operator
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 8.5, 7.2));
        //List<Double> notas = new ArrayList<Double>(); //Generics(jdk5) - diamond operator
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 8.5, 7.2);
        notas.add(10);
        System.out.println(notas);*/
        //List<Double> notas = List.of(7d, 8.5, 9.3, 8.5, 7.2); //Lista imutável


        System.out.println("Crie uma lista e adicione 5 notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(8.5);
        notas.add(7.20);

        System.out.println(notas.toString());
        // System.out.println(notas); Também pode ser usado.

        System.out.println("Exiba a posição da nota 8.5:");
        System.out.println("Posição: "+notas.indexOf(8.5));

        System.out.println("Adicione a nota 8 na posição 4:");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substittua a nota 7 pela nota 7.5:");
        notas.set(notas.indexOf(7d), 7.5);
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem em que foram inseridas:");
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada:");
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota:");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota:");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: ");
        System.out.println(soma/notas.size());

        System.out.println("Remova a nota 7.2");
        notas.remove(7.2);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0:");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas maiores que 8 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next > 8) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);
*/
        System.out.println("Confira se a lista está vazia:" +notas.isEmpty());
    }

}
