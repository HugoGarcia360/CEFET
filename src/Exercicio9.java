import java.util.Scanner;

public class Exercicio9 {

    static float soma(float valor1, float valor2) {
        float result;
        result = valor1 + valor2;

        return result;
    }

    static float subtracao(float valor1, float valor2) {
        float result = 0;
        result = valor1 - valor2;

        return result;
    }

    static float divisao(float valor1, float valor2) {
        float result = 0;
        result = valor1 / valor2;

        return result;
    }

    static float multi(float valor1, float valor2) {
        float result = 0;
        result = valor1 * valor2;

        return result;
    }

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        float val1 = 0, val2 = 0;

        System.out.println("Digite o primeiro valor");
        val1 = scan.nextFloat();
        System.out.println("Digite o segundo valor");
        val2 = scan.nextFloat();

        while (val1 != 0 && val2 != 0) {
            System.out.println("Soma : " + soma(val1, val2));
            System.out.println("subtracao " + subtracao(val1, val2));
            System.out.println("divisao " + divisao(val1, val2));
            System.out.println("multiplicacao " + multi(val1, val2));

            System.out.println("Digite o primeiro valor");
            val1 = scan.nextFloat();
            System.out.println("Digite o segundo valor");
            val2 = scan.nextFloat();
        }

    }
}