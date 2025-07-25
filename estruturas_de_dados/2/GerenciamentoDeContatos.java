import java.util.*;

public class GerenciamentoDeContatos {
    private Map<String, Contato> contatos;


    // Construtor
    public GerenciamentoDeContatos() {
        contatos = new HashMap<>();
    }


    // Adiciona um novo contato
    public void adicionarContato(String nome, String telefone, String email) {
        if (!contatos.containsKey(nome)) {
            Contato contato = new Contato();
            contato.adicionarTelefone(telefone);
            if (contato.adicionarEmail(email)) {
                contatos.put(nome, contato);
                System.out.println("Contato " + nome + " adicionado com sucesso!");
            } else {
                System.out.println("Email duplicado para o contato " + nome + "!");
            }
        } else {
            System.out.println("Contato " + nome + " já existe!");
        }
    }


    // Exibe todos os contatos
    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }
        for (Map.Entry<String, Contato> entry : contatos.entrySet()) {
            System.out.println("Nome: " + entry.getKey());
            entry.getValue().exibirContato();
            System.out.println("-------------------------");
        }
    }


    // Busca um contato pelo nome
    public void buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato encontrado: " + nome);
            contatos.get(nome).exibirContato();
        } else {
            System.out.println("Contato " + nome + " não encontrado.");
        }
    }


    // Remove um contato pelo nome
    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato " + nome + " removido com sucesso!");
        } else {
            System.out.println("Contato " + nome + " não encontrado.");
        }
    }


}
