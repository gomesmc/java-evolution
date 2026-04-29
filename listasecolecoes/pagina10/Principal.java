package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina10;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList <Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Carlota", 88);
        Pessoa pessoa2 = new Pessoa("Marilda", 55);
        Pessoa pessoa3 = new Pessoa("Josildo", 60);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Total de pessoas na lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista completa: \n" + listaDePessoas.toString());

    }
}
