import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        List<Produto> livros = new ArrayList<>();
        for (Produto p : pedido.getProdutos()) {
            if (p.getCategoria() == CategoriaProduto.LIVRO) {
                livros.add(p);
            }
        }
        return livros;
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .findFirst()
                .orElse(null);
    }
}