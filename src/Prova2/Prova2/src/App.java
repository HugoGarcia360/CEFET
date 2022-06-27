public class App {
    public static void main(String[] args) throws Exception {
        Cliente clientes[] = new Cliente[5];
        Cliente C1 = new Cliente("11111", "999", "prime", "Hugo", "@gmail");
        Cliente C2 = new Cliente("11111", "999", "prime", "Hugo", "@gmail");
        Cliente C3 = new Cliente("11111", "999", "prime", "Hugo", "@gmail");
        Cliente C4 = new Cliente("11111", "999", "normal", "Hugo", "@gmail");
        Cliente C5 = new Cliente("11111", "999", "normal", "Hugo", "@gmail");

        clientes[0] = C1;
        clientes[1] = C2;
        clientes[2] = C3;
        clientes[3] = C4;
        clientes[4] = C5;

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].getCategoria().equals("prime")) {
                clientes[i].imprimeDados();
                clientes[i].calculaDesconto();
            }
             
            
        }

    }

}
