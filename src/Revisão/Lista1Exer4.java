import java.util.Scanner;

/*Escreva uma algoritmo para retornar a soma dos números inteiros que existem no intervalo
fechado entre n1 e n2, informados pelo usuário via teclado. A função funcionará inclusive se o valor
de n2 for menor que n1. */

public class Lista1Exer4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int inter1 = 0, inter2 = 0, soma = 0;

        System.out.println("Digite um valor inteiro para determinar um intervalo");
        inter1 = scan.nextInt();
        System.out.println("Digite um valor inteiro para determinar o intervalo");
        inter2 = scan.nextInt();

        if (inter1 > inter2) {
            int aux = inter2;
            inter2 = inter1;
            inter1 = aux;

        }
        for (int i = inter1; i <= inter2; i++) {
            soma = soma + inter1;
            inter1++;

        }
        System.out.println("O valor da soma e " + soma);
        scan.close();
    }

}
