import java.util.Scanner;

public class Agenda {

    private int quantAmigos, quantConhecidos;
    private Pessoa[] p1;
    Scanner scan = new Scanner(System.in);

    public Agenda(int quantPessoas) {
        p1 = new Pessoa[quantPessoas];
        int random = (int) (1 + (Math.random() * 2)); // gera numero aleatorio 1 ou 2

        if (random == 1) { // se valor gerado for 1 cria um amigo
            p1 = new Amigo();
        }
        if (random == 2) { // se valor gerado for 2 cria um conhecido
            p1 = new Conhecido();
        }
    }

    public int getQuantAmigos() {
        return quantAmigos;
    }

    public void setQuantAmigos(int quantAmigos) {
        this.quantAmigos = quantAmigos;
    }

    public int getQuantConhecidos() {
        return quantConhecidos;
    }

    public void setQuantConhecidos(int quantConhecidos) {
        this.quantConhecidos = quantConhecidos;
    }

    public Pessoa getP1() {
        return p1;
    }

    public void setP1(Pessoa p1) {
        this.p1 = p1;
    }

    public void addInformacoes(){
        for ( int i=0; i < p1[quantPessoas]; i++){
            System.out.printn("Digite o nome da pessoa");
            p1[i].setNome(scan.nextLine());
            System.out.println("Digite a idade da pessoa");
            p1[i].setIdade(scan.nextInt());
            if (p1[i] instanceof Amigo) {
                System.out.println("Digite o aniversario");
                p1[i].setDataNascimento(scan.nextLine());
            }
            else {
                System.out.println("DIgite o email");
                p1[i].setEmail(scan.nextLine());
            }
        }
    }

    public void imprimeAniversarios(){
        for ( int i =0; i < p1[quantPessoas]; i ++){
            if (p1[i] instanceof Amigo) {
                System.out.println("data de aniversario: " +getNome);
            }
        }
    }

    public void imprimeEMail (){
        System.out.println("");
    }

}
