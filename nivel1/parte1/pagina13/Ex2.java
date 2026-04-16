package br.com.cursoalura.exercicios.nivel1.parte1.pagina13;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro número inteiro: ");
        int numeroUm = scan.nextInt();

        System.out.println("Insira o segundo número inteiro: ");
        int numeroDois = scan.nextInt();

        if (numeroUm == numeroDois){
            System.out.println("Os números são iguais");
        } else if(numeroUm != numeroDois && numeroUm > numeroDois){
            System.out.println("Os números são diferentes \nO primeiro número é maior que o segundo número");
        } else if(numeroUm != numeroDois && numeroDois > numeroUm){
            System.out.println("Os números são diferentes\nO segundo número é maior que o primeiro número");
        }
    }
}
