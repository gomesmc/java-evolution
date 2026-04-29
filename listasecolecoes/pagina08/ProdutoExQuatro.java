package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.util.ArrayList;

public class ProdutoExQuatro {
    private String nome;
    private double preco;

    public ProdutoExQuatro(String nome, double preco){
        this.nome = nome;
        this.preco=preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public static void main(String[] args) {
        ProdutoExQuatro produto1 = new ProdutoExQuatro("Café Pilão Moído", 18.90);
        ProdutoExQuatro produto2 = new ProdutoExQuatro("Açúcar Refinado", 4.50);
        ProdutoExQuatro produto3 = new ProdutoExQuatro("Arroz Branco", 25.00);

        ArrayList <ProdutoExQuatro> listaProdutos= new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double soma =0;
        for(ProdutoExQuatro produtos: listaProdutos){
            soma +=produtos.getPreco();
        }

        double mediaDePrecos = soma / listaProdutos.size();
        System.out.printf("A média de preço entre os produtos é de: R$ %.2f", mediaDePrecos );
    }
}
