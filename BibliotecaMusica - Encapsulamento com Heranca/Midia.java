
public class Midia {
	private String titulo;
	private String artista;
	private int duracao;
	
	public Midia(String titulo, String artista, int duracao) {
		this.titulo = titulo;
	    this.artista = artista;
	    this.duracao = duracao;
	}
	public String getTitutlo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
	
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " segundos");
    }
	
}
