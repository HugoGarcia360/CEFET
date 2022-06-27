public class Fatura {
    private int numero, quantidade;
    private double preco;
    private String descricao;

    public Fatura(int numero, String descricao){ //construtor da classe Fatura
        this.numero=0;
        this.quantidade=0;
        this.descricao = "";
        this.preco = 0.0;
    }
    public void setPreco(double p){ //atributo preco recebe valor p (set necessario para acessar atributo privado)
        if ( p<0){
            preco = 0.0;
        }
        else {
            preco = p;
        }
     
    }
    public void setNumero (int n){
        numero = n;
    }
    public void setQuantidade (int q){
        quantidade = q;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public String getDescString(){
        return descricao;
    }
    public int getNumero(){
        return numero;
    }
    public double getTotalFatura(){
        double total = preco * quantidade;
        if (total < 0){
            return 0;
        }
        else {
            return total;
        }

    }


}
