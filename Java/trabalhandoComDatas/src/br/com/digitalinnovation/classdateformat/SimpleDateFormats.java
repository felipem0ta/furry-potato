package br.com.digitalinnovation.classdateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormats {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String dataSimples = formatter.format(data);
        System.out.println(dataSimples);

    }
}
