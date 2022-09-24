import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nCrie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estados = new HashMap<>();  // Cria um dicionário
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);
        System.out.println(estados);

        System.out.println("\nSubstitua a população do estado RN por 3.534.165: ");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: ");
        estados.put("PB", 4018127);
        System.out.println(estados);

        System.out.println("\nExiba a população de PE: ");
        System.out.println(estados.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem em que foram informados: ");
        Map<String, Integer> estados2 = new LinkedHashMap<>();  // Cria um dicionário
        estados2.put("PE", 9616621);
        estados2.put("AL", 3351543);
        estados2.put("CE", 9187103);
        estados2.put("RN", 3534165);
        estados2.put("PB", 4018127);
        System.out.println(estados2);

        System.out.println("\nExiba todos os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estados3 = new TreeMap<>(estados2);  // Cria um dicionário
        System.out.println(estados3);

        Collection<Integer> populacao = estados.values();  // Cria uma coleção com os valores do dicionário
        String estadorMaiorpopulacao = "";
        String estadorMenorpopulacao = "";

        for(Map.Entry<String, Integer > entry : estados.entrySet()) {
            if (entry.getValue() == Collections.max(populacao)) {
                estadorMaiorpopulacao = entry.getKey();
            }
            if (entry.getValue() == Collections.min(populacao)) {
                estadorMenorpopulacao = entry.getKey();
            }
        }

        System.out.println("\nExiba o estado com a menor população e sua população: ");
        System.out.println(estadorMenorpopulacao + " - " + Collections.min(populacao));

        System.out.println("\nExiba o estado com a maior população e sua população: ");
        System.out.println(estadorMaiorpopulacao + " - " + Collections.max(populacao));

        int soma = 0;
        Iterator <Integer> iterator = populacao.iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população desses estados: ");
        System.out.println(soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: ");
        System.out.println(soma / populacao.size());
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(estados);

        System.out.println("\nApague o dicionário de estados: ");
        estados.clear();
        System.out.println(estados);

       
    }
}
