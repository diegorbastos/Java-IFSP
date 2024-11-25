
public class main {

	public static void main(String[] args) {
		Musica musica = new Musica("Cheio de sal", "Mc Gorila", 240, "Pop");
		
		System.out.println("Informações da Música:");
        musica.exibirInfo();
        System.out.println();

        musica.setTitulo("Perfect");
        musica.setGenero("Romântica");
        
        System.out.println("Informações da Música Modificada:");
        musica.exibirInfo();
        System.out.println();

        Podcast podcast = new Podcast("Tecnologia no Dia a Dia", "Carlos Silva", 1800, 15);
        
        System.out.println("Informações do Podcast:");
        podcast.exibirInfo();
        System.out.println();

        podcast.setTitulo("Inovação e Futuro");
        podcast.setEpisodio(16);
        
        System.out.println("Informações do Podcast Modificado:");
        podcast.exibirInfo();
	}

}
