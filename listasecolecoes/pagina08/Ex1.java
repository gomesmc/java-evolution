package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList<>();
        lista.add("Item 1");
        lista.add("Item 2");
        lista.add("Item 3");
        lista.add("Item 4");

        for(String item: lista){
            System.out.println(item);
        }
    }
}