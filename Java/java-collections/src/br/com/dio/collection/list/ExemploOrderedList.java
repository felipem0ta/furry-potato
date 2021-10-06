package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrderedList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Penelope", 12, "marrom"));
            add(new Gato("Margarida",10,"Preto e branco"));
            add(new Gato("Sansão",17 , "Cinza"));
        }};
        System.out.println("Lista meus gatos na ordem de inserção: " +meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println("Lista meus gatos na ordem aleatória: "+meusGatos);

        Collections.sort(meusGatos);
        System.out.println("Por ordem natural (Nome): "+meusGatos);

        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println("Por ordem de idade: "+meusGatos);


        meusGatos.sort( new ComparatorCor());
        System.out.println("Por ordem de Cor: "+meusGatos);

        meusGatos.sort(new ComparatorCorNomeIdade());
        System.out.println("Por cor/idade/nome: "+meusGatos);

    }
}

class Gato implements  Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' + '\n' +
                ", idade=" + idade + '\n' +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorCorNomeIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        var nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        var cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}