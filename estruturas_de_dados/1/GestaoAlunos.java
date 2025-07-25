import java.util.ArrayList;
import java.util.List;

// Classe GestaoAlunos
class GestaoAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(String nome, int idade) {
        alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno adicionado com sucesso.");
    }

    public void excluirAluno(String nome) {
        boolean removido = alunos.removeIf(aluno -> aluno.getNome().equalsIgnoreCase(nome));
        System.out.println(removido ? "Aluno removido com sucesso." : "Aluno não encontrado.");
    }

    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Aluno encontrado: " + aluno);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            alunos.forEach(System.out::println);
        }
    }
}