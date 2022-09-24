package Collections.ExemploList2.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// dada as seguintes informações sobre os gatos, crie uma lista e ordene esta lista exibindo:
// (nome - idade - cor)
// Gato 1 = nome: Jon, idade: 18, cor: preto
// Gato 2 = nome: Simba, idade: 6, cor: tigrado
// Gato 3 = nome: Lion, idade: 12, cor: amarelo


public class App {
    public static void main(String[] args) throws Exception {
        List<Gato> meusgatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Lion", 12, "amarelo"));
        }};
        System.out.println(meusgatos);

        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusgatos);
        System.out.println(meusgatos);

        System.out.println("Ordem natural");
        Collections.sort(meusgatos);
        System.out.println(meusgatos);

        System.out.println("Ordem por Idade");
        Collections.sort(meusgatos, new ComparatorIdade());
        System.out.println(meusgatos);

        System.out.println("Ordem por cor");
        Collections.sort(meusgatos, new ComparatorCor());
        System.out.println(meusgatos);

        System.out.println("Ordem por nome, cor e idade");  //primeiro nome, depois cor e depois idade
        Collections.sort(meusgatos, new ComparatorNomeCorIdade());
        System.out.println(meusgatos);
        
    }

}
