package abstrata;

public class Amigo extends Pessoa{
    private String anv;
    public Amigo(){
        super();
        this.anv = "indefinido";
    }
    public String getAnv() {
        return anv;
    }
    public void setAnv(String anv) {
        this.anv = anv;
    }
}
