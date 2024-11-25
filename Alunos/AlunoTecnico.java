public class AlunoTecnico extends Aluno {
    private int cargaHoraria;

    public AlunoTecnico(String nome, String matricula, int cargaHoraria) {
        super(nome, matricula);
        this.cargaHoraria = cargaHoraria;
    }

    public void realizarProjeto() {
        System.out.println("O aluno técnico está realizando um projeto prático.");
    }

}
