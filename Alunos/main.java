public class main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345");
        aluno1.estudar();
        aluno1.fazerProva();

        AlunoGraduacao aluno2 = new AlunoGraduacao("Maria", "54321", "Engenharia");
        aluno2.estudar();
        aluno2.fazerProva();
        aluno2.fazerEstagio();

        AlunoPosGraduacao aluno3 = new AlunoPosGraduacao("Pedro", "67890", "Inteligência Artificial");
        aluno3.estudar();
        aluno3.fazerProva();
        aluno3.defenderTese();

        AlunoTecnico aluno4 = new AlunoTecnico("Ana", "09876", 1200);
        aluno4.estudar();
        aluno4.fazerProva();
        aluno4.realizarProjeto();
    }
}
