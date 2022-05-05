
/*Crie um programa que leia o valor inteiro da idade de uma pessoa e imprima uma das mensagens:
se idade < 13: Criança, se 13 <= idade < 20: Adolescente, se 20 <= idade < 60: Adulto e se idade >=
60: Idoso.  */
import java.util.Scanner;

public class Lista1Exer1 {
    public static void main(String args[]) {
        int age = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero interio");
        age = scan.nextInt();

        if (age < 13) {
            System.out.println("Criança");
        } else if (age <= 13 && age < 20) {
            System.out.println("Adolescente");
        } else if (age <= 20 && age < 60) {
            System.out.println("Adulto");
        } else if (age >= 60) {
            System.out.println("Idoso");
        }
        scan.close();
    }
}
