package br.com.cursoalura.exercicios.nivel1.apis.primeiraaplicacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);
        int numeroDigitado = 0;
        int tentativas = 0;

        while (tentativas < 5){
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = scan.nextInt();
            tentativas++;

            if (numeroDigitado == aleatorio){
                System.out.println("Parabéns, você acetou o número em: " + tentativas + "tentativas!");
                break;
            }else if(numeroDigitado < aleatorio){
                System.out.println("O número digitado é menor que o número gerado");
            }else if(numeroDigitado > aleatorio){
                System.out.println("O número digitado é maior que o número gerado");
            }
        }
        if(tentativas == 5 && numeroDigitado != aleatorio){
            System.out.println("Você atingiu o limite máximo de tentativas: " + tentativas);
        }
    }
}