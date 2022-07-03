public class Amigo extends Pessoa {
    String dataNascimento;

    public Amigo (){
        dataNascimento = "indefinido";
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
