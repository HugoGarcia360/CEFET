import java.util.Scanner;

/*Desenvolva um algoritmo para imprimir todos os números pares no intervalo 1-100 */
public class Lista1Exer3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
