package Collections.ExemploSet.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5 está no conjunto");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a menor nota");
        System.out.println(Collections.min(notas));

        System.out.println("Exiba a maior nota");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas");
        System.out.println(soma / notas.size());

        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) { // hasNext() verifica se existe um próximo elemento
            Double next = iterator2.next(); // next recebe o proximo elemento
            if (next < 7)
                iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados");
        Set<Double> notas2 = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exibas todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2); // TreeSet ordena os elementos
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear(); // apaga todo o conjunto

        System.out.println("Confira se o conjunto está vazio");
        System.out.println(notas.isEmpty()); // retorna true se o conjunto estiver vazio
        
    }
}
