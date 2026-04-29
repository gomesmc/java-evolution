package br.com.cursoalura.exercicios.nivel1.apis.parte1.pagina14;

public class Ex4 {
    public static void main(String[] args) {
        double precoProduto = 25.9;
        int quantidade=5;

        double novoValor = precoProduto * quantidade;
        System.out.print("""
                Preço original do produto: R$ %.2f
                Quantidade: %d
                Novo preço R$ %.2f
                
                """.formatted(precoProduto,quantidade,novoValor));
    }
}
