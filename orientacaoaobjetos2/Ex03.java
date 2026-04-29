package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex03 {

    double saldo=1579.42;

    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public void zerarSaldo(){
        this.saldo=0.0;
        System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
    }

    public static void main(String[]args){
        Ex03 minhaConta = new Ex03();

        minhaConta.exibirSaldo();
        minhaConta.zerarSaldo();
        minhaConta.exibirSaldo();
    }
}
