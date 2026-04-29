package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Titulo implements Comparable <Titulo> {
    private String nome;

    public Titulo(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
       return  this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString(){
        return this.getNome();
    }

    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Carros");
        Titulo titulo2 = new Titulo("A Nova Onda do Imperador");
        Titulo titulo3 = new Titulo("Shrek");

        List<Titulo> listaDeTitulos = new ArrayList<>();

        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);

        System.out.println("Lista ordenada:");
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
    }
}
