package bibliotecaEscolar;

public class Livro {
	
	private String titulo;
	private boolean disponivel;
	
	public Livro (String titulo) {
		this.titulo = titulo;
		this.disponivel = true;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	public void emprestar() {
		if (this.disponivel) {
			this.disponivel = false;
			System.out.println("O livro " + this.titulo + " foi emprestado.");
		} else {
			System.out.println("O livro " + this.titulo + " foi devolvido");
		}
	}
	
	public void devolver() {
		this.disponivel = true;
		System.out.println("O livro " + this.titulo + " foi devolvido");
	}	
}
