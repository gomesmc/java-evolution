package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina10;


public class Gato extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Som do gato: MIAUUU");
    }

    public void arranharMoveis(){
        System.out.println("Oh não! O gato está arranhando os móveis!!!");
    }
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
