package Tabuada;

// Classe TabuadaMultiplicacao implementando Tabuada
public class TabuadaMultiplicacao implements Tabuada {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("\nTabuada de multiplicação do " + numero + ":\n");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    @Override
    public void calcularTabuada(int numero) {

    }
}