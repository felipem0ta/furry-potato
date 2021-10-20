package br.com.dio.collection.map;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        /*
        * Crie um dicionário com seus livros favoritos, quantidade de páginas e seus autores. Imprimindo somente o nome
        * do autor e o nome do livro.
        * */
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
           put("Duhigg, Charles", new Livro("O poder do hábito", 405));
           put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet())
            System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());

        System.out.println("Ordem de inserção: ");
        Map<String, Livro> livrosOrdem = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 405));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : livrosOrdem.entrySet())
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabética de autores:");
        Map<String,Livro> ordemAutores = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : ordemAutores.entrySet())
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());

        System.out.println("Ordem alfabética de nome dos livros:");

        Set<Map.Entry<String, Livro>> meusLivros2 = new TreeSet<>(new ComparatorNome());
        meusLivros2.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros2)
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());

    }



}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}