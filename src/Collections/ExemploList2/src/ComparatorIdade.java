import java.util.Comparator;

public class ComparatorIdade implements Comparator <Gato>{
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

    }

