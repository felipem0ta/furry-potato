package condicionais;

public class If {
    public static void main(String[] args) {
        final var condicao = false;

        if (condicao) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (!condicao)
            System.out.println("If de uma linha");

        final var ternario = condicao ? "É verdadeira!" : "É falsa!";
        System.out.println(ternario);
    }
}
