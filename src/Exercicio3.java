import java.util.Scanner;
public class Exercicio3 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o numero do funcionario");
        long numero = scan.nextInt();
        System.out.println("Digite o numero total de horas trabalhadas");
        int horas = scan.nextInt();
        System.out.println("Digite o valor recebido por hora");
        int valorhora = scan.nextInt();
        
        double salario = (horas * valorhora);
        
        System.out.println("O numero de funcionario e " + numero);
        System.out.printf("O salario do funcionario e %.2f \n",salario );
        
        
        
        
        
    }
}
