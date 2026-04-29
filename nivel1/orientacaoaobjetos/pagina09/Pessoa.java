package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Pessoa {

    public void exibeMensagem(){
        System.out.println("Olá, Mundo!");
    }

    public static void main(String[] args) {

        Pessoa exemploPessoa = new Pessoa();
        exemploPessoa.exibeMensagem();
    }
}
