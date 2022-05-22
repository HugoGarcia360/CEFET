public class Contato {
    String nome, telefone[] = new String[5], email;
    int qntTelefone = 0;

    public void addTelefone(String telefone) {
        if (qntTelefone < 5) {
            this.telefone[qntTelefone] = telefone;
            qntTelefone++;
        }
    }

    public void exibeContato() {
        System.out.println("O nome do contato e " + nome);
        System.out.println("O email do contato e " + email);

        for (int i = 0; i < qntTelefone; i++) {
            System.out.println(telefone[i]);
        }
    }

}
