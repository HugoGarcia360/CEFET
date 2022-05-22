public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro(); //cria objeto com nome c1 do tipo carro
        c1.marca = "Chevrolet";
        c1.nome = "Prisma";
        c1.velocidadeMax = 240f;
        c1.ligado = true;

        Carro c2 = new Carro();
        c2.marca = "Mitsubish";
        c2.nome = "Pajero";
        c2.velocidadeMax= 260;
        c2.ligado = false;

        c1.status();
        c1.desligar();
        c1.status();
        c2.status();

    }
}
