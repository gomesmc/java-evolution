package br.com.cursoalura.exercicios.Encapsulamento;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laboratorio user1 = new Laboratorio("aluno2026", "senha@123");

        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o seu usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a sua senha: ");
            String senha = scanner.nextLine();

            if (user1.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        scanner.close();
    }
}
