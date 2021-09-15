package br.com.digitalinnovation.one;
import java.util.Arrays;

public class ComposicaoDeFuncoes {
    public static void main(String[] args) {
        //Paradigma funcional
        int[] valores = {1,2,3,4};
        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));

    }

//    public void calcular(somar(x,y)){
//
//    }
//
//    public int somar(int x, int y){
//        return x+y;
//    }


}
