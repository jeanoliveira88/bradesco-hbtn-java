import java.util.*;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    // ✅ Adiciona uma postagem à lista
    public void adicionarPostagem(Post postagem) {
        postagens.add(postagem);
    }

    // ✅ Retorna um Set de autores ordenados pelo nome
    public Set<String> obterTodosAutores() {
        Set<String> autoresOrdenados = new TreeSet<>();
        for (Post p : postagens) {
            autoresOrdenados.add(p.getAutor());
        }
        return autoresOrdenados;
    }

    // ✅ Retorna um Map com contagem de postagens por categoria, ordenado pelo nome da categoria
    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post p : postagens) {
            contagem.put(p.getCategoria(), contagem.getOrDefault(p.getCategoria(), 0) + 1);
        }
        return contagem;
    }
}
