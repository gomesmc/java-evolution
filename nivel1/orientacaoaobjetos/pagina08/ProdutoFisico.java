package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class ProdutoFisico extends LivroEx2 implements Calculavel{
    private double preco = 100.0;

    @Override
    public double calcularPrecoFinal() {
        double precoTaxaLivroFisico = preco * 0.15;
        double precoFinalLivroFisico = preco + precoTaxaLivroFisico;
        System.out.printf("Taxa sobre livro: %.2f", precoTaxaLivroFisico);
        System.out.printf("\nPreço do livro físico: R$ %.2f", precoFinalLivroFisico);
        return precoFinalLivroFisico;
    }

    public static void main(String[] args) {
        ProdutoFisico livroFisico = new ProdutoFisico();
        livroFisico.calcularPrecoFinal();
    }
}
