package Geometrico;

// Classe CalculadoraSalaRetangular implementando CalculoGeometrico
public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("\nA área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("\nO perímetro da sala retangular é: " + perimetro);
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}