package Temperatura;

// Interface ConversorTemperatura
public interface ConversorTemperatura {
    double celsiusParaFahrenheit(double temperaturaCelsius);

    double fahrenheitParaCelsius(double temperaturaFahrenheit);

    double converterParaCelsius(double fahrenheit);

    double converterParaFahrenheit(double celsius);
}