package br.com.cursoalura.exercicios.nivel1.apis.primeiraaplicacao.pagina13;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numeroInt = scan.nextInt();

        if(numeroInt % 2 ==0){
            System.out.printf("O número %d é par", numeroInt);
        }else {
            System.out.printf("O número %d é ímpar", numeroInt);
        }

    }
}
