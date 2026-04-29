package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina08;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int  numeroTabuada){
       for(int i=0; i <= 10; i++){
           System.out.println( numeroTabuada + " x " + i + " = " + (i * numeroTabuada ));
       }
    }

    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();

        tabuada.mostrarTabuada(2);
    }
}
