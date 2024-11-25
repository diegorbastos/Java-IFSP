public class Aluno {
    public String nome;
    public String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println("O aluno " + nome + " está estudando.");
    }

    public void fazerProva() {
        System.out.println("O aluno " + nome + " está fazendo uma prova.");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345");
        aluno1.estudar();
        aluno1.fazerProva();
    }
}
