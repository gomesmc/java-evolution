package br.com.cursoalura.exercicios.nivel1.apis.parte1.pagina13;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numeroInt = scan.nextInt();

        if (numeroInt > 0 && numeroInt % 2 == 0) {
            System.out.println("Par");
        } else if (numeroInt > 0 && numeroInt % 2 != 0) {
            System.out.println("Ímpar");
        } else {
            System.out.println("Opção inválida!");

        }
    }
}