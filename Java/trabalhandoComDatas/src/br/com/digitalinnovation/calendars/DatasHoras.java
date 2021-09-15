package br.com.digitalinnovation.calendars;
import java.util.Calendar;

public class DatasHoras {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Data e hora completa

        System.out.printf("%tF\n", agora);
        //Somente data AAAA/MM/DD

        System.out.printf("%tD\n", agora);
        //Somente data MM/DD/AA

        System.out.printf("%tr\n", agora);
        //Horário AM/PM

        System.out.printf("%tT\n", agora);
        //Horário
    }
}
