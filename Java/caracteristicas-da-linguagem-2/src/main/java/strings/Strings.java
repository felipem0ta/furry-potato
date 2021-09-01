package strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        var nome = "Felipe";
        var sobreNome = "Mota";
        var nomeCompleto = nome + " " + sobreNome;
        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do cliente: " + nomeCompleto);
        System.out.println("Caracter na posição 5: " + nomeCompleto.charAt(5));
        System.out.println("Contem M? " + nomeCompleto.contains("M"));
        System.out.println("Contem X? " + nomeCompleto.contains("X"));
        System.out.println("Upper: "+ nomeCompleto.toUpperCase());
        System.out.println("lower: "+ nomeCompleto.toLowerCase());
        final var mensagem = String.format("O cliente %s possui o sobrenome %s.", nome,sobreNome);
        System.out.println(mensagem);
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split("/"));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));


    }
}
