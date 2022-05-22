import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        int numContato, numTelefone;
        Scanner scan = new Scanner(System.in);
        Agenda a = new Agenda(); // cria objeto a da classe Agenda

        System.out.println("Quantos contatos deseja inserir");
        numContato = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numContato; i++) {
            Contato c = new Contato();
            System.out.println("Informe o nome");
            c.nome = scan.nextLine();
            System.out.println("Informe o email");
            c.email = scan.nextLine();
            System.out.println("Quantos numeros deseja inserir");
            numTelefone = scan.nextInt();
            scan.nextLine();
            for (int j = 0; j < numTelefone; j++) {
                System.out.println("Informe o telefone");
                String tel = scan.nextLine();
                c.addTelefone(tel);
            }

            a.addContato(c);

        }

        a.exibirContato();

        scan.close();
    }
}
