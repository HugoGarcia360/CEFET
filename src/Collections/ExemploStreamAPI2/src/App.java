import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> numerosAleatorios = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        System.out.println("Imprima todos os numeros Aleatorios da Lista");
        numerosAleatorios.stream().forEach(System.out::println); //imprime todos os numeros da lista

        numerosAleatorios.stream().forEach( s -> System.out.println(s)); //usando funcao lambda

        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
        System.out.println(coresDaBandeiraDoBrasil);

        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
        System.out.println(consoantesMeuNome);
                
        
    }
}
