package Heranca.salario;

public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double diferenca = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            double bonusExtra = diferenca > 0 ? diferenca * 0.01 : 0.0;
            return this.salarioFixo * 0.20 + bonusExtra;
        }
        return 0;
    }
}
