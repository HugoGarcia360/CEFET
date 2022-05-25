/* Faça um programa que crie um vetor de tamanho 10 e adicione em todos as posições de índices
(i) ímpares o número 1 e nas pares o número 2. Em seguida, imprima o vetor.*/
public class Lista1Exer7 {
    public static void main(String args[]) {
        int vetor[] = new int[10];

        for( int i=0; i<10; i++){
            if ( i%2 == 1){
                vetor[i] = 1;
            }
            else {
                vetor [i] = 2;
            }
        }
        for (int i=0; i<10; i++){
            System.out.println(vetor[i]);
        }
    }

}