public class Agenda {
    Contato c1[] = new Contato[100]; // cria o vetor de nome c1 do tipo Contato(objeto)
    int qntContato = 0;

    public void addContato(Contato c) {
        if (qntContato < 100) {
            c1[qntContato] = c;
            qntContato = qntContato + 1;
        }
    }

    public void alteraNome(Contato c, String nome) {
        c.nome = nome;

    }

    public void exibirContato() {
        for (int i = 0; i < qntContato; i++) {
            c1[i].exibeContato(); // chama o metodo exibeContato para o objeto c1
        }
    }

}
