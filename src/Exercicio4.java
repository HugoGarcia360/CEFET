//Exercicio 1 da lista de Exercicios de Revisão 07/04/2022
import java.lang.Math;
import java.util.Scanner;
public class Exercicio4 {
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double number = scan.nextDouble();

        if(number < 0) {
            System.out.println("O numero nao tem raiz quadrada");

        }
        else {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        }



    }
}
