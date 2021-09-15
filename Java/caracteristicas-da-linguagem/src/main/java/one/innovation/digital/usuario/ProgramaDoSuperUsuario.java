package one.innovation.digital.usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1qaz@wsx");

        superUsuario.getLogin();
        superUsuario.getSenha();
        String root = superUsuario.nome;
    }
}
