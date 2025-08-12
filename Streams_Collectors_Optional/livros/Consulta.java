import java.util.ArrayList;
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
}