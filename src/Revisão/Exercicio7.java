
import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num=0, soma=0;

        for (int i=0; i < 10; i++){
        System.out.println("Digite um numero inteiro");
        num = scan.nextInt();
            if (num >= 0){
            soma = soma + num;
            }
            System.out.println("A soma dos numeros maiores que zero e " + soma);
        }
    }
}
