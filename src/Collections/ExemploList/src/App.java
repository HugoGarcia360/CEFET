import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


//crie uma lista e adicione 7 notas
public class App {
    public static void main(String[] args) throws Exception {
    
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(5.0);
        notas.add(2.0);
        notas.add(0.0);
        notas.add(3.0);
        notas.add(4.0);
        System.out.println(notas);
        System.out.println("A nota na posicao 0 e: " + notas.get(0));
        System.out.println("A nota 7.0 esta na posicao : " + notas.indexOf(7.0));

        System.out.println("Adicionando a nota 8 na posição 7: ");
        notas.add(7, 8.0);
        System.out.println(notas);
        System.out.println("Substituindo a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("Removendo a nota 0.0: ");
        notas.remove(0.0);
        System.out.println("Verificar se existe a nota 5.0: " + notas.contains(5.0));
        System.out.println("A menor nota e " + Collections.min(notas));
        System.out.println("A maior nota e " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas e " + soma);
        System.out.println("A media das notas e " + soma / notas.size());
        notas.sort(null);
        System.out.println(" As notas em ordem crescente sao "+ notas);
        notas.sort(Collections.reverseOrder());
        System.out.println(" As notas em ordem decrescente sao "+ notas);

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println("As notas acima de 7 sao " + notas);
        System.out.println("Apagando todas as notas: ");
        notas.clear();
        System.out.println(notas);
        System.out.println("A lista esta vazia? " + notas.isEmpty());
        
    }
}
