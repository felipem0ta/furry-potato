/**Exercicio:
 * Descobrir o currtentMillis da data do meu nascimento (usei o site https://currentmillis.com)
 * Converter em um objeto Date
 * Comparar se é antes ou depois de 15/05/2010
 * */

package br.com.digitalinnovation.datas;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {
        Date nascimento = new Date(642072600000l); //https://currentmillis.com
        System.out.println("Data de nascimento: "+nascimento);

        Date dataCompara = new Date(1273915800000l);
        System.out.println(dataCompara);

        if (nascimento.before(dataCompara)){
            System.out.println(nascimento+ " É antes de "+dataCompara);
        }else{
            System.out.println(nascimento+ "É depois de "+ dataCompara);
        }
    }
}
