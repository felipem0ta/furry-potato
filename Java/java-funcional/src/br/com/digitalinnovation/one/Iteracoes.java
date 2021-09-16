package br.com.digitalinnovation.one;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Felipe", "Luisa", "Hanna", "Maria", "Hanna", "Luisa"};
        Integer[] numeros = {1,2,3,4};
        List<String> listaProfissoes = new ArrayList<>();
            listaProfissoes.add("Dev");
            listaProfissoes.add("Tester");
            listaProfissoes.add("Gerente");
            listaProfissoes.add("Gerente jr.");
            listaProfissoes.add("Gerente de projeto");
            listaProfissoes.add("Presidente");
        
        listaProfissoes.stream()
                        .filter(profissao -> profissao.startsWith("Gerente"))
                        .forEach(System.out::println);

       imprimirNomesFiltrados(nomes);
       imprimeDobro(numeros);
    }
 
    public static void imprimeDobro(Integer... numeros){
        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes){

         String nomesParaImprimir="";
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i] == "Hanna"){
                nomesParaImprimir+=" "+nomes[i];
            } 
        }

        System.out.println("Nomes do for: "+nomesParaImprimir);
        
        //Stream com filtro
        String nomesdoStream = Stream.of(nomes)
            .filter(nome -> nome.equals("Luisa"))
            .collect(Collectors.joining(" "));
        System.out.println("Nomes do Stream: "+nomesdoStream);

        //Stream com funcão de referência
        Stream.of(nomes)
                .forEach(System.out::println);
        
        //Stream com forEach
        Stream.of(nomes)
            .forEach(nome -> System.out.println("Impresso usando forEach: "+ nome));
        }
      
    }



