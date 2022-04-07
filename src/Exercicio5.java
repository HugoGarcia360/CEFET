public class Exercicio5 {
    public static void main (String [] args){
        int x=0; int y=0; int aux;

        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);

        if ( x > y){                           //troca os valores entre x e y caso o usurio digite y maior que x

            aux = x;
            x = y;
            y = aux;
        }
        for ( int i = x; i <=y; i++){               //i começa em X e continua equanto for menor ou igual a y
            if( i %2 == 0 && i % 3 == 0 ){          //verificando se o resto da divisão por 2 e 3 é igual a zero
                System.out.println("Os numeros multiplos de 2 e 3 sao" + i);
        }
 

        }


    }
}
