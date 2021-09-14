package br.com.digitalinnovation.one;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int val){
        if (val == 1){
            return val;
        } else {
            return val * fatorial((val -1));
        }
    }
}
