package Prova2;

public class Cliente {
    private String cpf, telefone, categoria;
    public String nome, email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Cliente(String cpf, String telefone, String categoria, String nome, String email) {
        this.cpf = cpf;
        this.telefone = telefone;
        this.categoria = categoria;
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String cpf, String categoria, String nome) {
        this.cpf = cpf;
        this.categoria = categoria;
        this.nome = nome;
    }

    public void imprimeDados() {
        System.out.println("CPF : " + this.cpf);
        System.out.println("nome : " + this.nome);
        System.out.println("telefone : " + this.telefone);
        System.out.println("email : " + this.email);
        System.out.println("categoria : " + this.categoria);
        System.out.println("");
    }

    public void calculaDesconto() {
        if (this.categoria.equals("prime")) {
            System.out.println("O desconto do cliente será 5%");
        } else if (this.categoria.equals("normal")) {
            System.out.println("O desconto do cliente será 2%");
        }

        else {
            System.out.println("Categoria invalida");
        }
    }

}
