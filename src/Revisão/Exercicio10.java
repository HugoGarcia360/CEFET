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
