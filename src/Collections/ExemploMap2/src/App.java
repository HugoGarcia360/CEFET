import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n--\tordem aleatoria:\t--\n");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("C.S.Lewis", new Livro("As cronicas de Narnia", 300));
            put("Tolkien", new Livro("Senhor dos Aneis", 500));
            put("Isaac Asimov", new Livro("Fundacao", 800));
            put("J.K.Rowling", new Livro("Harry Potter e a ordem da Fenix", 550));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tordem de insercao:\t--\n");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("C.S.Lewis", new Livro("As cronicas de Narnia", 300));
            put("Tolkien", new Livro("Senhor dos Aneis", 500));
            put("Isaac Asimov", new Livro("Fundacao", 800));
            put("J.K.Rowling", new Livro("Harry Potter e a ordem da Fenix", 550));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tordem alfabetica dos autores:\t--\n");
        Map<String, Livro> meusLivros2 = new TreeMap<>(){{  // TreeMap é usado quando a ordem é importante
            put("C.S.Lewis", new Livro("As cronicas de Narnia", 300));
            put("Tolkien", new Livro("Senhor dos Aneis", 500));
            put("Isaac Asimov", new Livro("Fundacao", 800));
            put("J.K.Rowling", new Livro("Harry Potter e a ordem da Fenix", 550));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tordem alfabetica dos livros:\t--\n");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("\n--\tordem do numero de paginas:\t--\n");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
        }

    }
}
