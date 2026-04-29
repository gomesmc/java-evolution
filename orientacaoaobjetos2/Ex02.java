package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex02 {
    String titulo;
    String autor;
    int paginas;

    public void infoLivros(){
        System.out.printf("\"%s\" de %s com %d páginas", titulo, autor, paginas);
    }

    public static void main(String[] args) {
        Ex02 meusLivros = new Ex02();

        meusLivros.titulo="O Guia dos Mochileiros das Galáxias";
        meusLivros.autor="Douglas Adams";
        meusLivros.paginas=208;

        meusLivros.infoLivros();
    }
}
