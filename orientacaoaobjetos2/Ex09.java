package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex09 {
    String titulo;
    int diasAtraso;

    public void atraso(){
        double multa = 2.50;
        if(diasAtraso == 0){
            System.out.println("Você não tem multas");
        }else{
           double valorMulta = this.diasAtraso * multa;
            System.out.printf("Livro: %s | Multa por %d dias de atraso: R$%.2f"
            , titulo, diasAtraso, valorMulta);
        }
    }

    public static void main(String[] args) {
        Ex09 livro = new Ex09();

        livro.titulo="Dom Casmurro";
        livro.diasAtraso=3;

        livro.atraso();
    }
}
