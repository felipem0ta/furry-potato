package br.com.dio.collection.set;

import java.sql.SQLOutput;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto de notas de um aluno: ");;
        /*
         * Cria um Set de Double implementando HashSet e passar o Arrays asList como parâmetro.
         * */
        Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 6.5, 7d, 5d, 0d));
        System.out.println(notas.toString());

        /*
         * System.out.println("Exiba a posição da nota 5: ");
         * No Set e HashSet não se trabalha com posições
         * */

        //O método contains retorna boolean caso o elemento pesquisado exista no Set.
        System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));

        //Um Set é uma Collection, por tanto implementa seus métodos.
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        //Assim como List, usa-se Iterator no Set
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            var next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("Exiba a média das notas: "+soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            var next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem que foram inseridas:");
        Set<Double> notas2 = new LinkedHashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 6.5, 7d, 5d, 0d));
        /*
        * Set e HashSet não trabalha com ordenação, para exibir as notas na ordem de inserção, deve-se
        * usar LinkedHashSet
        * As notas podem ser adicionadas normalmente com o método add.
        * */
        notas2.add(3.2);
        System.out.println(notas2);

        System.out.println("Exiba as notas em ordem crescente: ");
        /*
        * Para utilizar organizações deve-se usar TreeSet, pois ela trabalha com a ordem natural
        * dos elementos.
        * */
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("O conjunto 'notas' foi apagado? "+ notas.isEmpty());
        System.out.println("O conjunto 'notas2' foi apagado? "+ notas2.isEmpty());
        System.out.println("O conjunto 'notas3' foi apagado? "+ notas3.isEmpty());
    }
}
