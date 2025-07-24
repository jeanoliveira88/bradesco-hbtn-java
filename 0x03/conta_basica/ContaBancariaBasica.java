public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0.0;
    }

    // Getters
    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Métodos principais
    public void depositar(double valor) throws exceptions.OperacaoInvalidaException {
        if (valor <= 0) {
            throw new exceptions.OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws exceptions.OperacaoInvalidaException {
        if (valor <= 0) {
            throw new exceptions.OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > saldo) {
            throw new exceptions.OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double tarifaPorcentagem = saldo * 0.10;
        return Math.min(10.0, tarifaPorcentagem);
    }

    public double calcularJurosMensal() {
        if (saldo <= 0) {
            return 0.0;
        }
        double taxaMensal = taxaJurosAnual / 12.0 / 100.0;
        return saldo * taxaMensal;
    }

    public void aplicarAtualizacaoMensal() {
        saldo -= calcularTarifaMensal();
        saldo += calcularJurosMensal();
    }
}
