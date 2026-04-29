package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.util.ArrayList;

public class TesteArea {
    public static void main(String[] args) {
        ArrayList <Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(new Circulo(4));
        listaDeFormas.add(new Quadrado(7));

        for(Forma forma : listaDeFormas){
            System.out.printf("Área: %.2f" + forma.calcularArea());
        }
    }
}
