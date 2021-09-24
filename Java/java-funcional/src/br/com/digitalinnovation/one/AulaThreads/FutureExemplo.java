package br.com.digitalinnovation.one.AulaThreads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureExemplo {
    private static final ExecutorService trheadPool = Executors.newFixedThreadPool(3);
    
    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDaCasa()
                .forEach(atividade -> trheadPool.execute(() -> {
                    try {
                        atividade.realizar();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }));   
                
        trheadPool.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo...comodos) {this.comodos = Arrays.asList(comodos);}

    List<Atividade> obterAfazeresDaCasa(){
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) ->{
                    pivo.addAll(atividades);
                    return pivo;
                });
    }

}

interface Atividade{
    void realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    
    @Override
    List<Atividade> obterAfazeresDoComodo(){
        return Arrays.asList(
            this::arrumarGuardaRoupa,
            this::arrumarCama,
            this::varrerQuarto
        );
    }

    private void arrumarGuardaRoupa() throws InterruptedException {
            Thread.sleep(5000);
            System.out.println("Arrumando o guarda roupa.");
        }
    private void varrerQuarto()throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Varrendo o quarto.");
    }
    private void arrumarCama()throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Arrumando a cama");
    }
}




