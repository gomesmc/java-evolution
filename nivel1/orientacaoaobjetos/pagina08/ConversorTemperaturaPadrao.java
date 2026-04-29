package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class ConversorTemperaturaPadrao implements  ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit() {
        double temperaturaEmCelsius = 44.5;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.printf("Temperatura em Fahrenheit: %.2f °F",  temperaturaEmFahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius() {
        double temperaturaEmFahrenheit = 112.10;
        double temperaturaEmCelsius = (temperaturaEmFahrenheit -32) * 5/9;
        System.out.printf("\nTemperatura em Celsius: %.2f °C", temperaturaEmCelsius);

    }

    public static void main(String[] args) {
        ConversorTemperatura converterCelsiusParaFahrenheit = new ConversorTemperaturaPadrao();
        converterCelsiusParaFahrenheit.celsiusParaFahrenheit();
        converterCelsiusParaFahrenheit.fahrenheitParaCelsius();
    }
}
