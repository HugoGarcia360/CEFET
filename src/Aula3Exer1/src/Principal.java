public class Principal {
    public static void main (String args[]){
        Pessoa p1,p2,p3;

        p1 = new Pessoa();
        p2 = new Pessoa("masculino", "Hugo", "111419", 26);
        p3 = new Pessoa("Hugo");
        p1.ExibeInformacoes();
        p2.ExibeInformacoes();
        p3.ExibeInformacoes();
    }
    
}
