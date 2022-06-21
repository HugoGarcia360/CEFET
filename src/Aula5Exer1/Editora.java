package Aula5Exer1;

public class Editora {
    private String nome, localizacao;
    private int maxlivros, quant;
    Livro livros [] = new Livro [12];

    public Editora(String n, String l) { // Metodo construtor da classe Editora
        nome = n;
        localizacao = l;
        maxlivros = 12;
        quant = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void adicionalivro(Livro l) {
        if (quant < maxlivros){
        livros[quant] = l;
        quant++;
        }
        else System.out.println("QUantidade maxima excedida");
    }
    public void informalivro(){
        System.out.println("Livros publicados por " +nome);
        for (int i =0; i < quant; i++){
            livros[i].informa();
        }
    }

}
