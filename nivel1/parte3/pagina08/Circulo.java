package br.com.cursoalura.exercicios.nivel1.parte3.pagina08;

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
