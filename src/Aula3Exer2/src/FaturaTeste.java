public class FaturaTeste {

    public static void main(String[] args) throws Exception {
        Fatura f1 = new Fatura(1, "Fatura do cliente x");
        Fatura f2 = new Fatura(2, "Fatura da empresa x");
        f1.setQuantidade(20);
        f1.setPreco(23.50);

        f2.setQuantidade(-5);
        f2.setPreco(10);

        System.out.printf("Numero da fatura : %d\n", f1.getNumero());
        System.out.printf("Numero da fatura : %s\n", f1.getDescString());
        System.out.printf("Quantidade de item %d\n", f1.getQuantidade());
        System.out.printf("Preco do item %.2f\n", f1.getPreco());
        System.out.printf("Total Fatura : %.2f\n", f1.getTotalFatura());
        System.out.printf("Descricao da fatura : %s\n", f2.getDescString());
        System.out.printf("Quantidade de item : %d\n", f2.getQuantidade());
        System.out.printf("Preco do item : %.2f\n", f2.getPreco());
        System.out.printf("Total da Fatura : %.2f\n", f2.getTotalFatura());
    }
}
