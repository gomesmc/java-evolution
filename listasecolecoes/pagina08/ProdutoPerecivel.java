package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return super.toString() + " \nData de validade: " + this.dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Queijo", 37.90,
                1, "22/02/2026");
        System.out.println(produtoPerecivel);
    }
}
