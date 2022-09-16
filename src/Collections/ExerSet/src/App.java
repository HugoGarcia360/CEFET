
/*
Crie um conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tCriar um conjunto contendo as cores do arco-íris :");
        Set <String> coresArcoIris = new HashSet<>(); // Cria um conjunto vazio
        coresArcoIris.add("Violeta"); // Adiciona elementos no conjunto
        coresArcoIris.add("Anil");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Vermelho");
        System.out.println(coresArcoIris);

        System.out.println("\nExiba todas as cores do arco-íris uma abaixo da outra:");
        for (String cor : coresArcoIris) { // Percorre o conjunto arcoiris
            System.out.println(cor);
        }

        System.out.println("\nA quantidade de cores que o arco-íris tem:");
        System.out.println(coresArcoIris.size()); // Exibe a quantidade de elementos no conjunto

        System.out.println("\nExiba as cores em ordem alfabética:");
        Set <String> coresArcoIris2 = new TreeSet<>(coresArcoIris); // Cria um conjunto ordenado
        System.out.println(coresArcoIris2);

        System.out.println("\nExiba as cores na ordem inversa da que foi informada:");
        Set <String> coresArcoIris3 = new LinkedHashSet<>(  // Cria um conjunto vazio
            Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(coresArcoIris3);
        List <String> coresArcoIrisList = new ArrayList<>(coresArcoIris3); // Cria uma lista com os elementos do conjunto
        Collections.reverse(coresArcoIrisList); // Inverte a ordem dos elementos da lista
        System.out.println(coresArcoIrisList);
        System.out.println(coresArcoIris.isEmpty());

        System.out.println("\n\nExiba todas as cores que começam com a letra v:");
        for ( String cor : coresArcoIris){
            if (cor.startsWith("V")) System.out.println(cor);
        }
        
        System.out.println("\nRemovendo todas as cores que não começam com a letra V:");
        Iterator <String> it = coresArcoIris.iterator();   // Cria um iterador para o conjunto
        while(it.hasNext()){                               // enquanto o iterador tiver elementos
            if (it.next().startsWith("V")){  // se o elemento não começar com a letra v
                it.remove();
            }
        }

        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto:");
        coresArcoIris.clear();
        System.out.println("Confira se o elemento está vazio:");
        System.out.println(coresArcoIris.isEmpty());
    }
}
