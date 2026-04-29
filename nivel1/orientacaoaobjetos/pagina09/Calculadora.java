package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Calculadora {

    public double recebeNumero(double numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();

        System.out.printf("O dobro é: %.2f", minhaCalculadora.recebeNumero(2));
    }
}