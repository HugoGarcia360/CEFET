public class Caneta {
    boolean tampada = true;
    String cor;
    float ponta;

    public void status(){
        System.out.println("A caneta de cor " + cor + " tamanho " + ponta + " esta " +tampada);
    }

    public void tampar(){
        if(!tampada){
            tampada = false;
        }
    }

    public void destampar (){
        
    }

}
