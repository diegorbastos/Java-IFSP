class Bicicleta extends Veiculo {
    private String tipoBicicleta;

    // Construtor
    public Bicicleta(String modelo, int velocidadeMaxima, String tipoBicicleta) {
        super(modelo, velocidadeMaxima);
        this.tipoBicicleta = tipoBicicleta;
    }

    // Getters e Setters
    public String getTipoBicicleta() {
        return tipoBicicleta;
    }
    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a " + getVelocidadeMaxima() + " km/h.");
    }
}