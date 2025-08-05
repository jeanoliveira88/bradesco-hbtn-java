import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10.0; // valor inicial de 10%

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Supplier: calcula o preço com markup
    public Supplier<Double> precoComMarkup = () -> preco * (1 + percentualMarkup / 100);

    // Consumer: atualiza o percentual de markup
    public Consumer<Double> atualizarMarkup = novoValor -> this.percentualMarkup = novoValor;

    // Getters (opcional)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }
}
