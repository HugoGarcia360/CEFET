public class Produto {
    String nome;
    double peso, preco;

    public void informacoes() {  
        System.out.println(nome + " Preco R$ " + this.preco + " Peso : " + peso + "Kg");
    }

    public void vender (){
        System.out.println("O Produto " + this.nome + " foi vendido ");
    }

    public void pesar(){
        if(this.peso < 10) {
            System.out.println("Peso do produto " + this.nome + " : \n" + this.peso + "Kg");
        }
    }

    public void calcularDesconto(double desconto){
        this.preco *= 1 - desconto/10;
        informacoes();
    }


    
}
