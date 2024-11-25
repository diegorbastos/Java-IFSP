package biblioteca;

public class Livro extends ItemBiblioteca {
	private String genero;
	
	public Livro(String titulo, String autor, int anoPublicacao, String genero) {
		super(titulo, autor, anoPublicacao);
		this.genero = genero;
	}
	 public void exibirGenero() { 
		 System.out.println("Gênero: " + genero); } 
}
