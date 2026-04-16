package br.com.cursoalura.exercicios.nivel1.parte2.pagina08;

import br.com.cursoalura.exercicios.nivel1.parte2.pagina12.Produto;

public class LivroEx2 extends Produto implements Calculavel{
    private double preco=25.90;

    @Override
    public double calcularPrecoFinal() {
        double percentualCalculado = preco * 0.9;
        double precoFinal = preco + percentualCalculado;
        System.out.printf("Taxa sobre livro: %.2f", percentualCalculado);
        System.out.printf("\nPreço do livro digital: R$ %.2f", precoFinal);
        return precoFinal;
    }

    public static void main(String[] args) {
        LivroEx2 livro = new LivroEx2();
        livro.calcularPrecoFinal();
    }
}
