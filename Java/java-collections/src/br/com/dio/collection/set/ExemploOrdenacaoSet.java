package br.com.dio.collection.set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem Aleatória:");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("GOT", "Fantasia", 60));
           add(new Serie("The Umbrella Academy", "Ação", 65));
           add(new Serie("Manhunt", "Suspense", 45));
        }};
        for (Serie serie: minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem De inserção:");
        Set<Serie> minhasOrdenadasSeries = new LinkedHashSet<>(){{
            add(new Serie("GOT", "Fantasia", 60));
            add(new Serie("The Umbrella Academy", "Ação", 65));
            add(new Serie("Manhunt", "Suspense", 45));
        }};
        for (Serie serie: minhasOrdenadasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem natural (Tempo Episódio)");
        Set<Serie> minhasTreeSeries = new TreeSet<>(minhasOrdenadasSeries);
        System.out.println(minhasTreeSeries);

        System.out.println("Ordem natural (Nome)");
        minhasOrdenadasSeries.stream().sorted(new ComparaNome());
        System.out.println(minhasOrdenadasSeries);
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\n' +
                ", genero='" + genero + '\n' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}'+ '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}

class ComparaNome implements Comparator<Serie>{

    @Override
    public int compare(Serie s, Serie s1) {
        return s.getNome().compareToIgnoreCase(s1.getNome());
    }
}