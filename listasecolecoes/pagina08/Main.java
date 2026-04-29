package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina08;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        }
    }
}
