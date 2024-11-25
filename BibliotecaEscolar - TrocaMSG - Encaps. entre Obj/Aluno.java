package bibliotecaEscolar;

public class Aluno {
	private String nome;
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public void solicitarEmprestimo(Livro livro) {
		System.out.println("Aluno " + this.nome + " solicitou o emprestimo do livro " + livro.getTitulo());
		livro.emprestar();
	}
	
    public void devolverLivro(Livro livro) {
        System.out.println("Aluno " + this.nome + " está devolvendo o livro '" + livro.getTitulo() + "'.");
        livro.devolver();
    }
	
}
