package br.com.cursoalura.exercicios.nivel1.apis.parte1.pagina14;

public class Ex6 {
    public static void main(String[] args) {
        double precoOriginas = 120;
        double percentualDesconto = 10;

        double valorDesconto = precoOriginas - percentualDesconto;
        System.out.print("""
                Valor Original: %.2f
                Percentual de desconto : %.0f %%
                Preço com desconto: R$ %.2f
                """.formatted(precoOriginas, percentualDesconto, valorDesconto));
    }
}
