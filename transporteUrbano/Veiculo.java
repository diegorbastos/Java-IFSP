abstract class Veiculo {
    private String modelo;
    private int velocidadeMaxima;

    // Construtor
    public Veiculo(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        setVelocidadeMaxima(velocidadeMaxima);
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        if (velocidadeMaxima < 0) {
            throw new IllegalArgumentException("A velocidade máxima não pode ser negativa.");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void mover();
}
