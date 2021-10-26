package br.com.dio.collection.streamAPI;


        /*Dadas as seguintes informações, crie um dicionário e ordene exibindo
        (Nome id - Nome contato)

        id = 1 - Contato = Nome: Simba, número: 2222
        id = 1 - Contato = Nome: Cami, número: 5555
        id = 1 - Contato = Nome: Jon, número: 1111
        */


import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
            put(4, new Contato("Mark", 3333));
        }};
        for (Map.Entry<Integer,Contato> entry: agenda.entrySet()){
            System.out.println(entry.getKey() +" - "+ entry.getValue().getNome());
        }

        System.out.println("--\tOrdem De Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
            put(4, new Contato("Mark", 3333));

        }};
        for (Map.Entry<Integer,Contato> entry1: agenda1.entrySet()){
            System.out.println(entry1.getKey() +" - "+ entry1.getValue().getNome());
        }
        System.out.println("--\tOrdem De Telefone\t--");
        //Preciso organizar os valores, logo, vou usar Set e TreeSet;
        /* feito com Comparator

        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });*/

        /* feito com Function

        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> integerContatoEntry) {
                return integerContatoEntry.getValue().getNumero();
            }
        }));*/

        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(Comparator.comparing(
                integerContatoEntry -> integerContatoEntry.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set){
            System.out.println(entry.getKey() +" - "+ entry.getValue().getNumero() +": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem De Nome\t--");
        Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(
                integerContatoEntry -> integerContatoEntry.getValue().getNome()));

        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set1){
            System.out.println(entry.getKey() +" - "+ entry.getValue().getNumero() +": " + entry.getValue().getNome());
        }



    }
}

class Contato{
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}'+'\n';
    }
}
