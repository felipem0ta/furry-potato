package one.innovation.digital.interfaces;

public class Programa {
    public static void main(String[] args) {
        final Gol gol = new Gol();
        final Trator trator = new Trator();
        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do gol: "+ gol.marca());
        System.out.println("Marca do fiesta: "+ fiesta.marca());
        System.out.println("Marca do trator: "+ trator.marca());
        System.out.println("Registro do gol: "+gol.registro());
    }
}
