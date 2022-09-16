// dada as informações sobre as series favoritas de um usuario,
// crise um conjunto e ordene esse conjunto, exibindo (nome - genero - tempo de episodio

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("\t\tOrdem Aleatoria");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};

        for(Serie serie: minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\t\tOrdem natural - Tempo de Episodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries); // TreeSet ordena os elementos de acordo com a ordem natural

        for(Serie serie: minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\t\tOrdem Nome/Gênero/Tempo de Episodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); // TreeSet ordena os elementos de acordo com a ordem natural
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


    }   
}
