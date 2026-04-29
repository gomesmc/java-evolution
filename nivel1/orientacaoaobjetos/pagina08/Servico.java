package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class Servico implements Vendavel {

    private double precoHora = 50.0;
    private double desconto = 0.05;

    @Override
    public void precoTotalDoProduto(int horas) {
        double total = precoHora * horas;

        if (horas >= 8) {
            total -= total * desconto;
        }

        System.out.println("Total do serviço: R$ " + total);
    }

    @Override
    public double aplicaDesconto() {
        double valorDesconto = precoHora * desconto;
        System.out.println("Desconto por hora: R$ " + valorDesconto);
        return valorDesconto;
    }
}