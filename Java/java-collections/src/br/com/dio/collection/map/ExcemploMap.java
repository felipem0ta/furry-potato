package br.com.dio.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExcemploMap {
    public static void main(String[] args) {
        /*Dado os modelos de carro e seus consumos, faça:
            modelo = gol - consumo = 14,4km/l
            modelo = uno - consumo = 15,6km/l
            modelo = mobi - consumo = 16,1km/l
            modelo = hb20 - consumo = 14,5km/l
            modelo = kwid - consumo = 15,6km/l
        */

        System.out.println("Crie um dicionário que relacione os modelos de carro e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15,2km/L");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba a lista com os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); //O método keySet retorna um Set com as chaves do Map.
        System.out.println(modelos.toString());

        System.out.println("Exiba o modelo mais economico:");
        Double maisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico ="";
        for (Map.Entry<String, Double> entry :entries) {
            if (entry.getValue().equals(maisEconomico))
                modeloMaisEconomico = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: "+ modeloMaisEconomico+" - "+ maisEconomico);

        System.out.println("Exiba o modelo menos econômico:");
        Double menosEconomico = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEconomico ="";
        for (Map.Entry<String, Double> entry :entries2) {
            if (entry.getValue().equals(menosEconomico))
                modeloMenosEconomico = entry.getKey();

        }
        System.out.println("Modelo menos eficiente: "+ modeloMenosEconomico+" - "+ menosEconomico);


    }
}
