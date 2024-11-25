public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        int comprimentoInt = 5;
        int larguraInt = 3;

        System.out.println("Área (inteiros): " + retangulo.calcArea(comprimentoInt, larguraInt));
        System.out.println("Perímetro (inteiros): " + retangulo.calcPerimetro(comprimentoInt, larguraInt));

        double comprimentoFloat = 5.5;
        double larguraFloat = 3.3;
        System.out.println("Área (Float): " + retangulo.calcArea(comprimentoFloat, larguraFloat));
        System.out.println("Perímetro (Float): " + retangulo.calcPerimetro(comprimentoFloat, larguraFloat));
    }
}