package Aula5Exer1;

public class Livro {
    private String nome;
    private int paginas;

    public Livro (String n, int p) {
        nome = n;
        paginas = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void informa (){
        System.out.println("Livros publicados" + nome + paginas);
        
    }
}
