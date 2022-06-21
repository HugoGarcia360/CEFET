public class Administrador extends Empregado {
    double ajudaDeCusto=300;

@Override
    public double calcularSalario(){
        double value = salarioBase + ajudaDeCusto;
        return value;
    }

}
