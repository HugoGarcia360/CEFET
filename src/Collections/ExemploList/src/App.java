import java.util.ArrayList;
import java.util.Collections;
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
        notas.sort(null);
        System.out.println(notas);
        
    }
}
