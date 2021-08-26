package one.innovation.digital.interfaces;

public class Gol implements Carro, Veiculo{

    @Override
    public String marca() {
        return "Wolksvagem";
    }

    @Override
    public String registro() {
        return "1q2w3e542456532";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
    }
}
