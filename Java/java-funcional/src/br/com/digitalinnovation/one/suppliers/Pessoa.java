package br.com.digitalinnovation.one.suppliers;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Felipe";
        idade = 31;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, Idade: %d",nome, idade);
    }
}
