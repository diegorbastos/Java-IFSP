class Carro extends Veiculo {
    private int nPortas;

    // Construtor
    public Carro(String modelo, int velocidadeMaxima, int nPortas) {
        super(modelo, velocidadeMaxima);
        this.nPortas = nPortas;
    }

    // Getters e Setters
    public int getNPortas() {
        return nPortas;
    }
    public void setNPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo a " + getVelocidadeMaxima() + " km/h.");
    }
}