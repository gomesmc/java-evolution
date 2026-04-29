package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina10;

public class ContaBancaria {
    protected double saldo;

    public double depositar(double valorDeposito){
        this.saldo += valorDeposito;
        System.out.printf("\nValor depositado: R$ %.2f", valorDeposito);
        return saldo;
    }


    public double sacar(double valorSacado) {
        if (saldo <= 0 && valorSacado <=0) {
            System.out.println("\nOperação inválida");
        }else if (saldo < valorSacado){
            System.out.println("\nSaldo insuficiente");
        } else {
            this.saldo -= valorSacado;
            System.out.printf("\nValor sacado: R$ %.2f", valorSacado);
        }
        return saldo;
    }

    public void consultarSaldo(){
        System.out.printf("\nSaldo em conta: R$ %.2f", this.saldo);
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.depositar(500);
        minhaConta.consultarSaldo();

        minhaConta.sacar(100);
        minhaConta.consultarSaldo();

        minhaConta.depositar(400);
        minhaConta.consultarSaldo();
    }
}
