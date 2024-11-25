package biblioteca;

public class main {
    public static void main(String[] args) {
      
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        Revista revista = new Revista("National Geographic", "Diversos", 2023, 350);
        Artigo artigo = new Artigo("Inteligência Artificial", "Alan Turing", 1950, "Ciência da Computação");


        livro.exibirInfo();
        livro.exibirGenero();

        revista.exibirInfo();
        revista.exibirEdicao();

        artigo.exibirInfo();
        artigo.exibirAreaPesquisa();
    }
}
