package abstrata;

public class Conhecido  extends Pessoa{
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Conhecido(){
        super();
        email = "indefinido";
    }


}
