package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class CalculadoraSalaRetangular implements CalculoGeometrico {


    @Override
    public int calularArea(int altura, int largura) {
        int area = altura * largura;
        System.out.println("Área do retângulo: " + area);
        return area;

    }

    @Override
    public int calcularPerimetro(int altura, int largura) {
        int perimetro = (altura + altura) + (largura + largura);
        System.out.println("Perímetro do retângulo: " + perimetro);
        return perimetro;
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();

        salaRetangular.calularArea(4, 4);
        salaRetangular.calcularPerimetro(4, 4);
    }
}
