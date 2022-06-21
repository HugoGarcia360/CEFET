public class Main {
    public static void main(String args[]) {
        Administrador A1 = new Administrador();
        Empregado E1 = new Empregado();
        Fornecedor F1 = new Fornecedor();

        A1.setNome("Hugo");
        A1.setEndreco("Cataguases");
        A1.setTelefone("999269379");
        A1.setSalarioBase(4000);
        F1.setValorCredito(500);
        F1.setValorDivida(100);
        E1.setCodigoSetor(003);
        E1.setSalarioBase(3000);
        E1.setImposto(12);

        System.out.println("O nome e " + A1.getNome());
        System.out.println("O endereco e " + A1.getEndreco());
        System.out.println("O telefone e " + A1.getTelefone());
        System.out.println("O valor do credito e " + F1.getValorCredito());
        System.out.println("O valor da divida e " + F1.getValorDivida());
        System.out.println("O salario do administrador e " + A1.calcularSalario());
        System.out.println("O salario do empregado e " + E1.calcularSalario());
        System.out.println("O saldo e " + F1.obterSaldo());

    }
}
