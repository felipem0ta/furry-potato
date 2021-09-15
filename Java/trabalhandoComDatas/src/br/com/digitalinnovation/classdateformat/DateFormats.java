package br.com.digitalinnovation.classdateformat;
import java.text.DateFormat;
import java.util.Date;

public class DateFormats {
    public static void main(String[] args) {
        Date dataAgora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(dataAgora);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getTimeInstance().format(dataAgora);

        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(dataAgora);

        System.out.println(dateToStr);
    }
}
