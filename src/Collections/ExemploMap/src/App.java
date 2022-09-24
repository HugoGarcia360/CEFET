package Collections.ExemploMap.src;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
        Map <String, Double> carrosPopulares = new HashMap<>(){{ //cria um dicionario de carros populares
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("Substitua o consumo do Gol por 15,2 km/l:");
        carrosPopulares.put("Gol", 15.2); //substitui o consumo do gol por 15.2
        System.out.println(carrosPopulares.toString());

        System.out.println("Confira se o modelo Tucson está no dicionario: ");
        System.out.println(carrosPopulares.containsKey("Tucson")); //verifica se o modelo tucson esta no dicionario

        System.out.println("Exiba o consumo do Uno: ");
        System.out.println(carrosPopulares.get("Uno")); //exibe o consumo do uno

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values(); //values retorna uma coleção
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max (carrosPopulares.values()); //max retorna o maior valor
        Set <Map.Entry <String, Double>> entries = carrosPopulares.entrySet(); //entrySet retorna um set com elementos do tipo Entry
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries){ //percorre o set de entries
            if (entry.getValue().equals(consumoMaisEficiente)){ //verifica se o valor do entry é igual ao consumo mais eficiente
                modeloMaisEficiente = entry.getKey(); //se for, pega a chave do entry
                //System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min (carrosPopulares.values()); //min retorna o menor valor
        for (Map.Entry<String , Double> entry : carrosPopulares.entrySet()){ //percorre o set de entries
            if(entry.getValue().equals(consumoMenosEficiente)){ //verifica se o valor do entry é igual ao consumo menos eficiente
                modeloMaisEficiente = entry.getKey(); //se for, pega a chave do entry
                System.out.println("Modelo menos eficiente: " + modeloMaisEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){ //enquanto tiver um próximo valor
            soma += iterator.next(); //soma recebe a soma do valor atual + o próximo valor
        }
        System.out.println("Soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionario de carros: ");
        System.out.println("Média dos consumos: " + (soma/carrosPopulares.size())); //size retorna o tamanho do dicionário

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){ //enquanto tiver um próximo valor
            if(iterator1.next().equals(15.6)){ //se o valor atual for igual a 15.6
                iterator1.remove(); //remove o valor atual
            }
        }
        System.out.println("Dicionário de carros: " + carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{ //LinkedHashMap mantém a ordem de inserção
            put("Gol", 14.4); //put adiciona um novo elemento no dicionário
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo: "); //o modelo é a chave, então ordena pela chave
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1); //TreeMap ordena os elementos do dicionário
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        System.out.println("Confira se o dicionario esta vazio: " + carrosPopulares.isEmpty()); //isEmpty verifica se o dicionário está vazio
        carrosPopulares2.clear(); //limpa o dicionário
        System.out.println(carrosPopulares2.toString());
     

    }
}
