package br.com.cursoalura.exercicios.nivel1.apis.parte3.pagina08;

public class Quadrado implements Forma{
    double lado;

    public Quadrado (double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
