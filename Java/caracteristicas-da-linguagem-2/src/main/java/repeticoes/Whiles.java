package repeticoes;

public class Whiles {
    public static void main(String[] args) {
        var x=0;

        //Testa a condição antes
        while (x<2){
            System.out.println("Dentro do While...");
            x++;
        }

        var y=0;

        do {
            System.out.println("Dentro do Do/while");
        } while (y++<2);
    }
}
