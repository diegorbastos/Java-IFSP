
public class Musica extends Midia {
	private String genero;

	public Musica(String titulo, String artista, int duracao, String genero) {
        super(titulo, artista, duracao);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Gênero: " + genero);
    }
}
