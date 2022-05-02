
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a,b,x;
        
        System.out.println("Digite um valor inteiro");
        a = scan.nextInt();
        System.out.println("Difite um segundo valor inteiro");
        b = scan.nextInt();
        x = a+b;
        System.out.println("A soma dos valores e " + x);
        
    }
}
