package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        List <Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("ArrayList:");
        for(Integer listaDoArrayList : lista){
            System.out.println(listaDoArrayList);
        }

        lista = new LinkedList<>();
        lista.add(40);
        lista.add(50);
        lista.add(60);
        System.out.println("\nLinked List");
        for(Integer listaLinkeList : lista){
            System.out.println(listaLinkeList);
        }
    }
}
