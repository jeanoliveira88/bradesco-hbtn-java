package Heranca.salario;

public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return 0;
    }
}
