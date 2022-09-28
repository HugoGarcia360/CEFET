import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        boolean loop = true;
        do {
            String a = JOptionPane.showInputDialog("Digite o numerador");
            String b = JOptionPane.showInputDialog("Digite o denominador");

            try {
                int resultado = divisao(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado da divisao: " + resultado);
                loop = false;
            } catch (NumberFormatException e) { // captura o erro de formato de numero
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, digite um numero inteiro");
            } catch (ArithmeticException e) { // captura o erro de divisao por zero
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, impossivel dividir por zero");
            }

            finally {
                System.out.println("Fim do Finally");
            }
        } while (loop);

    }

    public static int divisao(int a, int b) {
        return a / b;
    }

}
