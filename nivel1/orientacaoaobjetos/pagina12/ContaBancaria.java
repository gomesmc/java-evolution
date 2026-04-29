package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina12;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

     public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1432.87);
        conta.titular="Fabiana Marins da Costa Rica";

        System.out.printf("""
                Titular: %s
                Número da conta: %d
                Saldo: R$ %.2f
                """.formatted(conta.titular, conta.numeroConta, conta.saldo));
    }
}
