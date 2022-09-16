import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//utilizando listas , faça um programa que faça 5 pergunras para uma pessoa sobre um crime. As perguntas são:
// "Telefonou para a vítima?"
// "Esteve no local do crime?"
// "Mora perto da vítima?"
// "Devia para a vítima?"
// "Já trabalhou com a vítima?"
// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
// Caso contrário, ele será classificado como "Inocente".

public class App {
    public static void main(String[] args) throws Exception {
        List<String> respostas = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\tResponda as perguntas com sim ou não : \n");
        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.nextLine()); // adiciona a resposta na lista
        System.out.println("Esteve no local do crime?");
        respostas.add(scan.nextLine());
        System.out.println("Mora perto da vítima?");
        respostas.add(scan.nextLine());
        System.out.println("Devia para a vítima?");
        respostas.add(scan.nextLine());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.nextLine());

        int cont = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) { // enquanto houver um proximo elemento na lista
            if (contador.next().equals("sim")) { // se o elemento for igual a sim
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("Suspeita");
        }
        if (cont == 3 || cont == 4) {
            System.out.println("Cúmplice");
        }
        if (cont == 5) {
            System.out.println("Assassino");
        }
        if (cont < 2) {
            System.out.println("Inocente");
        }

        scan.close();
    }

}
