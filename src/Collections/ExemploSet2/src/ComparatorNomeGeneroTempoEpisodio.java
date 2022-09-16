import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome()); // compara o nome
        if (nome != 0) // se o nome for diferente de 0, retorna o nome
            return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) // se o genero for diferente de 0, retorna o genero
            return genero;

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio()); 
        // se o nome e o genero forem iguais, retorna o tempo de episodio

    }

}
    
