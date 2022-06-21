package Aula5Exer1;

public class Main {
    public static void main (String args[]){
    Livro l1 = new Livro("Harry Potter e a pedra filosofal", 200);
    Livro l2 = new Livro("Harry Potter e a camera secreta", 200);
    Livro l3 = new Livro("Harry Potter e o prisioneiro de azkaban", 200);
    Livro l4 = new Livro("Harry Potter e o calice de fogo", 200);
    Livro l5 = new Livro("Harry Potter e a ordem da fenix", 200);
    Editora e1 = new Editora("Aleph" , "Leopoldina");
    Editora e2 = new Editora("Rocco", "Cataguases");

    e1.adicionalivro(l1);
    e1.adicionalivro(l2);
    e1.adicionalivro(l3); 
    e2.adicionalivro(l4);
    e2.adicionalivro(new Livro("Quimica" , 150));
    e1.informalivro();
    e2.informalivro();
    }
}
