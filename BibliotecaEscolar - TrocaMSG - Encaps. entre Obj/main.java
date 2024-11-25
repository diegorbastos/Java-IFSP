package bibliotecaEscolar;

public class main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("A culpa é das estrelas");
		Livro livro2 = new Livro("Duna");
		
		Aluno aluno1 = new Aluno("Diego");
		Aluno aluno2 = new Aluno("Wendel");
		
		aluno1.solicitarEmprestimo(livro1);
		aluno1.solicitarEmprestimo(livro1);
		
		aluno2.solicitarEmprestimo(livro2);
		
		aluno1.devolverLivro(livro1);
		
		aluno2.solicitarEmprestimo(livro1);
		aluno2.devolverLivro(livro2);
		aluno2.devolverLivro(livro1);
	}
}
