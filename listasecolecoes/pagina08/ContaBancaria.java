package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.io.FilterOutputStream;
import java.util.ArrayList;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo){
        this.numeroDaConta=numeroDaConta;
        this.saldo=saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria minhaContaBancaria1 = new ContaBancaria(1234, 432.21);
        ContaBancaria minhaContaBancaria2 = new ContaBancaria(4536, 754.67);
        ContaBancaria minhaContaBancaria3 = new ContaBancaria(96785670, 45345);

        ArrayList<ContaBancaria> listaContaBancaria = new ArrayList<>();

        listaContaBancaria.add(minhaContaBancaria1);
        listaContaBancaria.add(minhaContaBancaria2);
        listaContaBancaria.add(minhaContaBancaria3);

        ContaBancaria contaComMaiorSaldo = listaContaBancaria.get(0);

        for(ContaBancaria saldoEmConta : listaContaBancaria){
            if(saldoEmConta.getSaldo() > contaComMaiorSaldo.getSaldo()){
                contaComMaiorSaldo = saldoEmConta;
            }
        }

        System.out.printf("""
                Conta com maior saldo:
                Conta: %d
                Saldo em conta: R$ %.2f
                """, contaComMaiorSaldo.getNumeroDaConta(), contaComMaiorSaldo.getSaldo());

    }


}
