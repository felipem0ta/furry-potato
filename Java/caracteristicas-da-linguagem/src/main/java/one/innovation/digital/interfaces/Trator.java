package one.innovation.digital.interfaces;

public class Trator implements Veiculo{
    @Override
    public String marca() {
        return "John Deere";
    }

    @Override
    public String registro() {
        return "1QAZ2WSX345232BR";
    }

    @Override
    public void ligar() {
        Veiculo.super.ligar();
    }
}
