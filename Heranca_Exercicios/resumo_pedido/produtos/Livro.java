package produtos;

public class Livro extends Produto {
    int paginas;
    int edicao;
    String autor;

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = obterPrecoLiquido(precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }

    @Override
    public double obterPrecoLiquido(double precoBruto) {
        double percentualAcrescimo = 15.0 / 100.0;
        double precoLiquido = precoBruto + (precoBruto * percentualAcrescimo);
        return precoLiquido;
    }

}
