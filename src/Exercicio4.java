import java.lang.Math;
import java.util.Scanner;
public class Exercicio4 {
    public static void main (String []args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a number");
        double number = scan.nextDouble();

        if(number < 0) {
            System.out.println("This number does not has square root");

        }
        else {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        }



    }
}
