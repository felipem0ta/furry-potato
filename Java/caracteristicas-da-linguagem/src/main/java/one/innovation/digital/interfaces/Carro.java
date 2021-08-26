package one.innovation.digital.interfaces;

public interface Carro extends Automovel{
    String marca();

    default void ligar() {
        System.out.println("Ligando o carro!");
    }
}
