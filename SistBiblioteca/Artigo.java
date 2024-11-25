package biblioteca;

public class Artigo extends ItemBiblioteca {
    private String areaPesquisa;

    public Artigo(String titulo, String autor, int anoPublicacao, String areaPesquisa) {
        super(titulo, autor, anoPublicacao);
        this.areaPesquisa = areaPesquisa;
    }

    public void exibirAreaPesquisa() {
        System.out.println("Área de Pesquisa: " + areaPesquisa);
    }
}

