package br.com.cursoalura.exercicios.nivel1.pagina10;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Regras: Sua senha deve ter no mínimo 08 caractéres");
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        if(senha.length() > 8) {
            System.out.println("Senha aceita");
        }else{
            throw new SenhaInvalidaException("Sua senha precisa ter no mínimo 08 caractéres");
        }
        }catch(SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
