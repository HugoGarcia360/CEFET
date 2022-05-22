public class Pessoa {
    String nome,sexo;
    private int idade;
    private String cpf;

    public Pessoa(){ //metodo construtor da classe
        nome = "Nao informado";
        sexo = "Nao informado";
        idade = 0;
        cpf = "Nao informado";
    }
    public Pessoa(String nome, String sexo, String cpf, int idade){ //metodo construtor da classe
        this.nome = nome;
        this.sexo = cpf;
        this.cpf = cpf;
        this.idade = idade;
    }
    public Pessoa(String nome){
        this.nome = nome;
        this.sexo = "Nao informado";
        this.idade = -5;
        this.cpf = "Nao informado";
    }
    public void ExibeInformacoes(){
        System.out.printf("nome : %s, Idade : %d, CPF : %s, sexo : %s\n", nome, idade, cpf, sexo);
    }


    
}
