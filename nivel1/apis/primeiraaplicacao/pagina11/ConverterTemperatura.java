package br.com.cursoalura.exercicios.nivel1.apis.primeiraaplicacao.pagina11;

public class ConverterTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 40;
        double converterFahrenheit = (temperaturaEmCelsius * 1.8)+32;
        int fahrenheitInt = (int) converterFahrenheit;
        System.out.println("A temperatura em Fahrenheit é de: " + fahrenheitInt + " °F");

    }
}
