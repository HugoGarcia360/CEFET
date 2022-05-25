public class Produto {
    String nome;
    double peso, preco;

    public void informacoes() {  //metodo informaacoes printa na tela nome, preco e peso
        System.out.println(nome + " Preco R$ " + preco + " Peso : " + peso + "Kg");
    }

    public void vender (){
        System.out.println("O Produto " + nome + " foi vendido ");
    }

    public void pesar(){
        if(this.peso < 10) {
            System.out.println("Peso do produto " + nome + " : \n" + peso + "Kg");
        }
    }

    public void calcularDesconto(double desconto){
        preco *= 1 - desconto/10;
        informacoes();
    }


    
}
