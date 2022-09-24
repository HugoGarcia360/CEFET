package abstrata;

import java.lang.Math;
import java.util.Scanner;
public class Agenda {
    Pessoa pe[] ;
    private int qtd_amigos = 0,qtd_conhecidos = 0,qtd;

    public Agenda(int qtd){
        this.qtd = qtd;
        pe = new Pessoa[qtd];
        for(int i = 0;i < qtd;i++){
            int val = 1 + (int) (Math.random() * 2);
            if(val == 1){
                pe[i] = new Amigo();
                qtd_amigos++;
            }else{
                pe[i] = new Conhecido();
                setQtd_conhecidos(getQtd_conhecidos() + 1);
            }
        }
    }
    public int getQtd_conhecidos() {
        return qtd_conhecidos;
    }
    public void setQtd_conhecidos(int qtd_conhecidos) {
        this.qtd_conhecidos = qtd_conhecidos;
    }
    public int getQtd_amigos() {
        return qtd_amigos;
    }
    public void setQtd_amigos(int qtd_amigos) {
        this.qtd_amigos = qtd_amigos;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    void add_informacoes(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0 ;i < this.qtd;i++){
            System.out.println("Idade: ");
            pe[i].setIdade(teclado.nextInt());
            teclado.nextLine();
            System.out.println("Nome: ");
            pe[i].setNome(teclado.nextLine());
            if(pe[i] instanceof Amigo){
                Amigo a = (Amigo) pe[i];
                System.out.println("Aniversario: ");
                a.setAnv(teclado.nextLine());
            }else{
                Conhecido c = (Conhecido) pe[i];
                System.out.println("Email: ");
                c.setEmail(teclado.nextLine());
            }
        }
    }

    void imprime(){
        for(int i = 0 ;i < this.qtd;i++){
            if(pe[i] instanceof Amigo){
                Amigo a = (Amigo) pe[i];
                System.out.println("data de aniversario: "+a.getAnv());
            }else{
                Conhecido c = (Conhecido) pe[i];
                System.out.println("Email: "+c.getEmail());
            }
        }
    }
}
