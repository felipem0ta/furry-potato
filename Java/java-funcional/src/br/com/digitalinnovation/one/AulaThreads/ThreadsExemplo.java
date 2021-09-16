package br.com.digitalinnovation.one.AulaThreads;


public class ThreadsExemplo {
    public static void main(String[] args) {
        /* Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento3());

        thread.start();
        thread2.start();

        System.out.println("Rodei "+thread.getName());
        System.out.println("Rodei "+thread2.getName()); */
        GerarPDF iniGerarPDF = new GerarPDF();
        BarraDeCarregamento bCarregamento = new BarraDeCarregamento(iniGerarPDF);

        iniGerarPDF.start();
        bCarregamento.start();


    }
    
}

class GerarPDF extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        System.out.println("PDF Gerado!");
        
    }
}

class BarraDeCarregamento extends Thread{

    private Thread iniGerarPDF;
    
    public BarraDeCarregamento(Thread gerarPDF){
        this.iniGerarPDF = gerarPDF;
    }

    @Override
    public void run() {
        System.out.print("Gerando PDF...");
        while(true){
        try{
            Thread.sleep(250);
                if (!iniGerarPDF.isAlive()) {
                    break;
                }
                System.out.print(".");
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }    
    
}
/* 
class BarraDeCarregamento2 implements Runnable {
    @Override
    public void run() {
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        System.out.println("Classe: Barra de Carregamento 2");
        
    }
}

class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run() {
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Classe: Barra de Carregamento 3");
        
    }
} */

