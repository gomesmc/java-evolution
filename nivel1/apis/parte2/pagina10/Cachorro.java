package br.com.cursoalura.exercicios.nivel1.apis.parte2.pagina10;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(){
        System.out.println("Som do cachorro: AUAUAUUU");
    }

    public void abanarRabo(){
        System.out.println("Cachorro está abanando o rabo");
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}
