package br.com.digitalinnovation.one.suppliers;

import java.util.function.Supplier;


public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        System.out.println(suppliers.get());
    }
}
