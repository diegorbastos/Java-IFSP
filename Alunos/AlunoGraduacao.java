public class AlunoGraduacao extends Aluno {
    private String curso;

    public AlunoGraduacao(String nome, String matricula, String curso) {
        super(nome, matricula);
        this.curso = curso;
    }

    public void fazerEstagio() {
        System.out.println("O aluno de graduação está fazendo estágio.");
    }

}
