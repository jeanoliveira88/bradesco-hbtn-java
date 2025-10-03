import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int id, String nome, String cargo, int idade, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public int compareTo(Pessoa o) {
        // Ordena por nome, depois por id
        int cmp = this.nome.compareTo(o.nome);
        if (cmp == 0) {
            return Integer.compare(this.id, o.id);
        }
        return cmp;
    }

    @Override
    public String toString() {
        String salarioFormatado = String.format("%.6f", salario).replace('.', ',');
        return String.format("[%d] %s %s %d R$ %s", id, nome, cargo, idade,salarioFormatado);
    }

}
