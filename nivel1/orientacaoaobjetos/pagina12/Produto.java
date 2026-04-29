package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina12;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double descontoProduto){
        this.preco -= this.preco * (descontoProduto / 100.0);
        return this.preco;
    }

    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        meuProduto.setNome("Vanish");
        meuProduto.setPreco(25.90);
        meuProduto.aplicarDesconto(10);

        System.out.printf("\nO produto %s está saindo por: R$ %.2f", meuProduto.getNome(), meuProduto.getPreco());

       }

}
