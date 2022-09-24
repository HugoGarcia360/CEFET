package Aula1Exer1.src;

public class Carro {
    String nome, marca;
    float velocidadeMax;
    boolean ligado;

    public void status (){
        System.out.println("Um carro " + nome);
        if (ligado){
            System.out.println("esta ligado");
        }
        else {
            System.out.println("Esta desligado");
        }
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }
}
