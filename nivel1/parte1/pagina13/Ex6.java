package br.com.cursoalura.exercicios.nivel1.parte1.pagina13;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numeroDigitado = scan.nextInt();
        long fatorial = 1;

        for (int i=1; i <= numeroDigitado; i++){
            fatorial *=i;
        }
        System.out.printf("O fatorial de %d! é %d", numeroDigitado, fatorial);
    }
}
