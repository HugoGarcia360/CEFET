/*Em uma indústria metalúrgica o custo de produção de uma peça automotiva
corresponde a um custo fixo mensal de R$5.000,00 acrescido de um custo
variável de R$55,00 por unidade produzida mais 25% de impostos sobre o
custo variável. Considerando que o preço de venda dessa peça é de
R$102,00, escrever:
a) a função que calcula o custo da produção de x peças.
b) a função que retorna a receita referente a venda de x peças.
c) a função que calcula o lucro na venda de x peças. */
import java.util.Scanner;

public class Exercicio10 {
    public static float custo (int x) {

        float total = (float) (5000 + 55 * x + 0.25 * (55 * x));
        return total;

    }

    public static float venda (int y) {

        int preco = 102 * y;
        return preco;
    }

    public static float lucro (float preco, float total) {

        float lucro = preco - total;
        return lucro;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("Digite o numero de peças produzidas");
        x = scan.nextInt();
        System.out.println("Digite o numero de peças vendidas");
        y = scan.nextInt();

        System.out.println("O custo de producao das pecas e de " + custo(x));
        System.out.println("A receita da venda das pecas foi de " + venda(y));
        //System.out.println("O lucro nas vendas das pecas foi de " + lucro(preco, total)); erro

        scan.close();
    }
}
