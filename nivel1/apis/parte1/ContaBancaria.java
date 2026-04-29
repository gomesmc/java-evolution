package br.com.cursoalura.exercicios.nivel1.apis.parte1;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeCliente = "Jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        double valorAReceber = 0;
        double valorARetirar = 0;

        int escolha = 0;

        System.out.println("*****************************************");
        System.out.println("Dados Iniciais do Cliente: \n");
        System.out.println("Nome: \t\t\t\t" + nomeCliente);
        System.out.println("Tipo de conta: \t\t" + tipoDeConta);
        System.out.println("Saldo Inicial: \t\tR$ " + saldoInicial);
        System.out.println("*****************************************");


        while (escolha != 4) {

            System.out.println("\n Operações ");

            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");

            System.out.println("\nDigite a operação que deseja realizar: ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println(String.format("Saldo atual: R$ %.2f", saldoInicial));
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido: R$ ");
                    valorAReceber = scan.nextDouble();
                    if (valorAReceber <= 0) {
                        System.out.println("Não inválido");
                    } else {
                        saldoInicial += valorAReceber;
                        System.out.println(String.format("Saldo atualizado: R$ %.2f", saldoInicial));
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja retirar: R$ ");
                    valorARetirar = scan.nextDouble();
                    if (valorARetirar > saldoInicial) {
                        System.out.println("Não há saldo suficiente para realizar essa transferência");
                    } else {
                        saldoInicial -= valorARetirar;
                        System.out.println(String.format("Saldo atual: R$ %.2f", saldoInicial));
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado com sucesso");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }
    }
}