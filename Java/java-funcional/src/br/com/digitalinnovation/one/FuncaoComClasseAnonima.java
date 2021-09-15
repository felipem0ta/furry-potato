package br.com.digitalinnovation.one;

public class FuncaoComClasseAnonima {
    public static void main(String[] args) {
        //Paradigma imperativo
        Funcao concatenarSrAoNome = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. "+valor;
            }
        };
        System.out.println(concatenarSrAoNome.gerar("Felipe"));

        //Paradigma Funcional
        Funcao adicionaSrAoNome = valor -> "Sr. "+valor;
        System.out.println(adicionaSrAoNome.gerar("Felipeta"));
    }

    interface Funcao{
        String gerar(String valor);
    }
}
