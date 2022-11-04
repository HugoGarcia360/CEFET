package Aula7Exer1;
import java.util.Scanner;


public class Teste {
    public static void main (String args[]){
        Agenda a ;
        Scanner scan  = new Scanner(System.in);
        a = new Agenda(5);
        System.out.println("amigos: "+a.getQuantAmigos());
        System.out.println("conhecidos: "+a.getQuantConhecidos());
        a.addInformacoes();
        a.imprimeAniversarios();
        a.imprimeEMail();
    }
}
