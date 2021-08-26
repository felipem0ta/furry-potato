package one.innovation.digital.interfaces;

public class Fiesta implements Carro{

    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
    }
}
