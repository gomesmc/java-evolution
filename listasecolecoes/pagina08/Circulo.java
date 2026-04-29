package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

import java.awt.geom.Area;

public class Circulo implements Forma {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
