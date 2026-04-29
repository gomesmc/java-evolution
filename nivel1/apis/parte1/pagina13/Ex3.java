package br.com.cursoalura.exercicios.nivel1.apis.parte1.pagina13;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("""
                MENU:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                \nDigite sua escolha: 
                """);

        int escolhaUsuario = scan.nextInt();

        if(escolhaUsuario ==1){
            System.out.println("\n1. Área do Quadrado: ");
            System.out.println("Digite o valor dos lados: ");
            int lados = scan.nextInt();
            int areaQuadrado = lados * lados;
            System.out.printf("Área do quadrado: %d", areaQuadrado);
        } else if (escolhaUsuario ==2){
            System.out.println("\n1. Área do Círculo: ");
            System.out.println("Digite o valor do raio: ");
            int raio = scan.nextInt();
            int areaCirculo = (int) (Math.PI * (raio * raio));
            System.out.println("Área do Círculo: " + areaCirculo);
        }

    }
}