/*Crie um programa em que o usuário preencha, via teclado, uma matriz 5 x 5.
Após o preenchimento desta matriz:
Exiba a soma dos valores da Diagonal Principal da Matriz
Exiba todos os valores da Diagonal Secundária da Matriz
Substitua os elementos da terceira linha pelo valor 1. E apresente a matriz ao final da alteração. 
Disponível em : https://github.com/HugoGarcia96/CEFET  */

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int tam = 5;

        for (int i = 0; i < 5; i++) { // preenche matriz e troca terceira linha por 1
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um número inteiro");
                matriz[i][j] = scan.nextInt();
                if (i==2){
                    matriz[2][j] = 1;
                }
            }
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) { // exibe matriz
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]);

            }
            System.out.println("");
        }

        System.out.print("A diagonal principal da matriz e: ");
        for (int i = 0; i < 5; i++) { // mostra diagonal principal

            System.out.print(matriz[i][i] + " ");
        }

        System.out.print("\nA diagonal secundaria da matriz e: ");
        for (int i = 0; i < 5; i++) { // mostra diagonal secundaria

            System.out.print(matriz[i][tam - 1 - i] + " ");

        }

    }
}