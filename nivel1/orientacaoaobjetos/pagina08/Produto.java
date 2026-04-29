package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class Produto implements Vendavel {
    public double preco = 200.00;
    double desconto=0.10;

    @Override
    public void precoTotalDoProduto(int quantidadeComprada) {
        if(quantidadeComprada < 5){
            System.out.println("Você não tem direito ao desconto\n");
        } else if(quantidadeComprada >=5){
            double aplicaDesconto = preco * desconto;
            double precoFinal = preco - aplicaDesconto;
            System.out.println("Preço total: R$ " + precoFinal);
        }
    }

    @Override
    public double aplicaDesconto() {
        double descontoAplicado = preco * desconto;
        System.out.println("Valor em reais do desconto aplicado: R$ " + descontoAplicado);
        return descontoAplicado;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.precoTotalDoProduto(6);
        produto.aplicaDesconto();
    }
}
