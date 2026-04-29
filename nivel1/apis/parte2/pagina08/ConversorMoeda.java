package br.com.cursoalura.exercicios.nivel1.apis.parte2.pagina08;

public class ConversorMoeda implements ConversaoFinanceira {
    double valorEmDolar=10;

    @Override
    public double converterDolarParaReal(){
        double valorEmReal = 5.22;
        valorEmReal *= valorEmDolar;
        System.out.printf("Dólar convertido em real = R$ %.2f", valorEmReal);
        return valorEmReal;
    }

    public static void main(String[] args) {
        ConversorMoeda converterMoedas = new ConversorMoeda();
        converterMoedas.converterDolarParaReal();
    }
}
