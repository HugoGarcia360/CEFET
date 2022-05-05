
/*Escreva um algoritmo para ler a matrícula de um aluno e suas três notas e calcular a média
ponderada do aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3.
Mostrar ao final a média calculada e uma mensagem “APROVADO” se a média for maior ou igual
a 60 e “REPROVADO” caso contrário. Repetir a operação até que o código lido seja negativo */
import java.util.Arrays;
import java.util.Scanner;

public class Lista1Exer5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long matricula;
        float media, notas[] = new float[3];

        System.out.println("Digite o numero de matricula");
        matricula = scan.nextLong();
        System.out.println("Digite a nota da primeira prova");
        notas[0] = scan.nextFloat();
        System.out.println("Digite a nota da segunda prova");
        notas[1] = scan.nextFloat();
        System.out.println("Digite a nota da terceira prova");
        notas[2] = scan.nextFloat();

        Arrays.sort(notas);
        media = (notas[0] * 3) + (notas[1] * 3) + (notas[2] * 4);
        float resultado = media / 4;

        if (resultado >= 60) {
            System.out.println("APROVADO\nA sua nota e " + resultado);
            System.out.println("Matricula : " + matricula);
        } else {
            System.out.println("REPROVADO\nA sua nota e " + resultado);
        }
        scan.close();
    }
}
