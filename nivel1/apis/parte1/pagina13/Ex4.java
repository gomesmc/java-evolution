package br.com.cursoalura.exercicios.nivel1.apis.parte1.pagina13;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 0 até 10 para ver sua tabuada: ");
        int numero = scan.nextInt();

            for (int i=1; i<=10; i++){
                System.out.println(numero + " x " + i + " = " + (numero*i));

        }
    }
}
