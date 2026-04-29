package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString(){
        return "\nNome: " + this.nome + " \nPreço: R$ " + this.preco + "\nQuantidade: " + this.quantidade;
    }

    public static void main(String[] args) {
        Produto meuProduto1 = new Produto("Vanish Oxi Action", 40.00, 1);
        Produto meuProduto2 = new Produto("Asssolan", 3.89, 8);
        Produto meuProduto3 = new Produto("Veja Multiuso", 6.38,1);

//        meuProduto1.setNome("Vanish Oxi Action");
//        meuProduto1.setPreco(40.00);
//        meuProduto1.setQuantidade(1);

//        meuProduto2.setNome("Assolan");
//        meuProduto2.setPreco(3.89);
//        meuProduto2.setQuantidade(8);

//        meuProduto3.setNome("Veja Multiuso");
//        meuProduto3.setPreco(6.30);
//        meuProduto3.setQuantidade(1);

        ArrayList <Produto> produtos = new ArrayList<>();
        produtos.add(meuProduto1);
        produtos.add(meuProduto2);
        produtos.add(meuProduto3);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Segundo produto da lista: " + produtos.get(1).getNome());

        System.out.println(produtos.toString());
    }
}
