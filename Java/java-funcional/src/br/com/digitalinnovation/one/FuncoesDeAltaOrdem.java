package br.com.digitalinnovation.one;

public class FuncoesDeAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        System.out.println(executarOperacao(soma,1, 3));

        Calculo multiplica = (a,b) -> a*b;
        System.out.println(executarOperacao(multiplica, 2, 4));

    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo{
    public int calcular(int a,int b);
}
