package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosInteiros {

     public static void main(String[] args) {

         List<Integer> listaNumerosInteiros = new ArrayList<>();
         listaNumerosInteiros.add(10);
         listaNumerosInteiros.add(2);
         listaNumerosInteiros.add(5);
         listaNumerosInteiros.add(20);

         Collections.sort(listaNumerosInteiros);
         System.out.println("Lista em ordem crescente: ");
         System.out.println(listaNumerosInteiros);
    }
}
