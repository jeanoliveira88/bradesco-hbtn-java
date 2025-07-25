// Classe principal com teste de execução
public class AplicacaoAlunos {
    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();

        // Adiciona três alunos
        gestao.adicionarAluno("Ana", 20);
        gestao.adicionarAluno("Bruno", 22);
        gestao.adicionarAluno("Carlos", 19);

        // Lista todos os alunos
        gestao.listarAlunos();

        // Busca por um aluno
        gestao.buscarAluno("Bruno");

        // Exclui um aluno
        gestao.excluirAluno("Carlos");

        // Tenta excluir um aluno inexistente
        gestao.excluirAluno("Daniel");

        // Busca outro aluno
        gestao.buscarAluno("Ana");
    }

}