public class Comida {
    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[" + nome + "] " + calorias + " R$ " + String.format("%.2f", preco);
    }

    // Getters (opcional, se quiser acessar os atributos fora da classe)
    public String getNome() { return nome; }
    public int getCalorias() { return calorias; }
    public double getPreco() { return preco; }
}
