public class Principal {
    public static void main (String args[]){
        Pessoa p1,p2,p3;

        p1 = new Pessoa();
        p2 = new Pessoa("Marina", "feminino", "111.111.111-11",30);
        p3 = new Pessoa("Pedro");
        p1.ExibeInformacoes();
        p2.ExibeInformacoes();
    }
    
}
