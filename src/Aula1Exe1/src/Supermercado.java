public class Supermercado {
    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto(); //cria o objeto p1 da classe produto
        p1.nome = "Arroz Prato Fino "; //modifica o atributo nome do objeto p1
        p1.peso = 15.0; //modifica o atributo peso do objeto p1
        p1.preco = 11.5; //modifica o atributo preco do objeto p1 

        Produto p2 = new Produto(); // cria objeto p2 da classe produto
        p2.nome = "Picanha";//modifica os atributos do objeto p2
        p2.peso = 1.0;
        p2.preco = 23.00;

        p1.informacoes();//executa metodo informacoes
        p2.informacoes();

        p1.vender();//executa metodo vender
        p2.vender();
    }
}
