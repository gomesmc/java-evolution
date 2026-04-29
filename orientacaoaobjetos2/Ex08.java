package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex08 {
    String nome;
    int quantidade;

    public void venda(int quantidadeVendida){
        if(quantidadeVendida <= this.quantidade){
            this.quantidade -= quantidadeVendida;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, quantidade);
        }else{
            System.out.println("Estoque insuficiente");
        }
    }

    public static void main(String[]args) {
        Ex08 estoque = new Ex08();
        estoque.nome="Camiseta";
        estoque.quantidade=10;

        estoque.venda(3);
        estoque.venda(8);
    }
}
