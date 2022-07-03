import java.util.Scanner;

public class teste {
    public static void main(String args[]){
        Agenda a ;
        Scanner teclado  = new Scanner(System.in);
        a = new Agenda(teclado.nextInt());
        System.out.println("amigos: "+a.getQtd_amigos());
        System.out.println("conhecidos: "+a.getQtd_conhecidos());
        a.add_informacoes();
        a.imprime();
    }
}
