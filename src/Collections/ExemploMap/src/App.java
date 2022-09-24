package Collections.ExemploMap.src;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
        Map <String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("Substitua o consumo do Gol por 15,2 km/l:");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo Tucson está no dicionario: ");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do Uno: ");
        System.out.println(carrosPopulares.get("Uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max (carrosPopulares.values());
        Set <Map.Entry <String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

    }
}
