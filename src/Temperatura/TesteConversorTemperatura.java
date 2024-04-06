package Temperatura;

// Classe de Teste
public class TesteConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        System.out.println("Conversão de Temperatura:\n");

        System.out.println("De Celsius para Fahrenheit:\n");
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        System.out.println("\nAgora de Fahrenheit para Celsius:\n");
        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}