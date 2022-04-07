import java.util.Scanner;

public class Exercicio6 {
    public static void main (String [] args){
        int numero1=0, numero2=0, aux=0, soma=0, multi=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        numero1 = scan.nextInt();
        System.out.println("Digite o segundo numemro");
        numero2 = scan.nextInt();

       
        for(int i = numero1; i <= numero2; i++){
            if ( i%2 == 0){
                soma = numero1 + numero2;
                multi = numero1 * numero2;
                System.out.println("A soma dos numeros e " + soma);   
            }
            else {
                System.out.println("A multiplicacao dos numeros e " + multi);
            }
        }

    }
}
