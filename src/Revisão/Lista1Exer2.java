/*Crie um programa que leia o número do dia da semana e imprima o seu respectivo nome
por extenso. Considerar o número 1 como domingo, 2 para segunda etc. Caso o dia não exista
(menor que 1 ou maior que 7), exibir a mensagem “Dia da semana inválido”.*/

import java.util.Scanner;

public class Lista1Exer2 {
    public static void main(String args[]) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero interio entre 1 e 7");
        num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("O dia e domingo");
                break;

            case 2:
                System.out.println("O dia da semana e segunda");
                break;

            case 3:
                System.out.println("O dia da semana e terca");
                break;

            case 4:
                System.out.println("O dia da semana e quarta");
                break;

            case 5:
                System.out.println("O dia da semana e quinta");
                break;

            case 6:
                System.out.println("O dia da semana e sexta");
                break;

            case 7:
                System.out.println("O dia da semana e sabado");
                break;

            default:
                System.out.println("Numero invalido");
        }
        scan.close();
    }
}
