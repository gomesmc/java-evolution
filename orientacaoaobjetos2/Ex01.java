package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex01 {

    String produto;
    double preco;
    int quantidade;

    public void infoProdutos(){
        System.out.printf("Nome: %s \nPreço: R$%.2f, \nQuantidade: %d", produto, preco, quantidade);
    }

    public static void main(String[] args) {

        Ex01 produto = new Ex01();

        produto.produto="Mouse Gamer";
        produto.preco=159.9;
        produto.quantidade=25;

        System.out.println("Informações sobre o produto:");
        produto.infoProdutos();

    }
}
