package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina10;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal=15;

    public double cobrarTarifaMensal(){
        saldo -= this.tarifaMensal;
        System.out.printf("\nValor da tarifa: R$ %.2f", tarifaMensal);
        System.out.printf("\nValor em conta após cobrança de tarifa: R$ %.2f", saldo);
        return saldo;
    }

    public static void main(String[] args) {
        ContaCorrente minhaContaCorrente = new ContaCorrente();

        minhaContaCorrente.depositar(300);
        minhaContaCorrente.consultarSaldo();

        minhaContaCorrente.cobrarTarifaMensal();
    }
}
