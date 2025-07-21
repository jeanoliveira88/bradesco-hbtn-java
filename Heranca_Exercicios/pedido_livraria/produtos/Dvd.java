package produtos;

public class Dvd extends Produto {
    String diretor;
    String genero;
    int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.precoBruto = obterPrecoLiquido(precoBruto);;
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }


    @Override
    public double obterPrecoLiquido(double precoBruto) {
        double percentualAcrescimo = 20.0 / 100.0;
        double precoLiquido = precoBruto + (precoBruto * percentualAcrescimo);
        return precoLiquido;
    }
}
