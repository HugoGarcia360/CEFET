public class Empregado extends Pessoa {
    private int codigoSetor, imposto;
    protected double salarioBase;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }
    public double calcularSalario(){
        double value = salarioBase - (imposto/100f);
        return value;
    }

    
}
