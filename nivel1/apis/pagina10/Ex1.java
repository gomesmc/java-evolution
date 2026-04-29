package br.com.cursoalura.exercicios.nivel1.apis.pagina10;

import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Digite o primeiro número: ");
            int numeroUm = Integer.parseInt(scanner.nextLine());

            System.out.println("Digite o segundo número: ");
            int numeroDois = Integer.parseInt(scanner.nextLine());

            int divisao = numeroUm/numeroDois;
            System.out.println("Resultado da divisão: " + divisao);
        }catch(ArithmeticException e){
            System.out.println("Não é possível dividir por zero");
        }catch(NumberFormatException e){
            System.out.println("Apenas números são permitidos");
        }
    }
}
