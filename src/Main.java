import Financeira.TesteConversorMoeda;
import Geometrico.TesteCalculadoraSalaRetangular;
import Tabuada.TesteTabuadaMultiplicacao;
import Temperatura.TesteConversorTemperatura;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Bem Vindo ao desafio!\n");
        TesteConversorMoeda.main(args);
        TesteCalculadoraSalaRetangular.main(args);
        TesteTabuadaMultiplicacao.main(args);
        TesteConversorTemperatura.main(args);

        System.out.println("\nFim do desafio!");
    }
}