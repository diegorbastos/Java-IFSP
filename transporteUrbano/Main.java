public class Main {
    public static void iniciarTransporte(Veiculo veiculo) {
        veiculo.mover();
    }

    public static void main(String[] args) {
        Carro carro = new Carro("SUV", 220, 4);
        Bicicleta bicicleta = new Bicicleta("Bicicleta Urbana", 40, "Elétrica");

        iniciarTransporte(carro);
        iniciarTransporte(bicicleta);
    }
}