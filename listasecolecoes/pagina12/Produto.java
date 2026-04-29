package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina12;

public class Produto implements Comparable <Produto> {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outroPreco) {
        return Double.compare(this.preco, outroPreco.getPreco());
    }
}
