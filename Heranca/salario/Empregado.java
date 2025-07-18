
public class Empregado {
    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return salarioFixo * 0.10;
        }
        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }
}
