public class AlunoPosGraduacao extends Aluno {
    private String areaPesquisa;

    public AlunoPosGraduacao(String nome, String matricula, String areaPesquisa) {
        super(nome, matricula);
        this.areaPesquisa = areaPesquisa;
    }

    public void defenderTese() {
        System.out.println("O aluno de pós-graduação está defendendo sua tese.");
    }

}
