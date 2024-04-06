package Temperatura;

// Classe ConversorTemperaturaPadrao implementando ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }

    @Override
    public double converterParaCelsius(double fahrenheit) {
        return 0;
    }

    @Override
    public double converterParaFahrenheit(double celsius) {
        return 0;
    }
}