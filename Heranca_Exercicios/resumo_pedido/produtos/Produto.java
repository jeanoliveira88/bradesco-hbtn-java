package produtos;

public abstract class Produto {

    String titulo;
    int ano;
    String pais;
    double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = precoBruto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }

    public int getAno() {
        return ano;
    }

    public String getPais() {
        return pais;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }

    public Produto() {
    }

    public abstract double obterPrecoLiquido(double precoBruto);
}
