package Financeira;

// Classe ConversorMoeda implementando ConversaoFinanceira
public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("\nO valor em reais é: R$" + valorReal);
    }
}