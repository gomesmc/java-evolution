package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina12;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Autor: %s", autor);
    }

    public static void main(String[] args) {
        Livro livroInformacoes= new Livro();

        livroInformacoes.setTitulo("O Assasinato No Expresso Oriente");
        livroInformacoes.setAutor("Agatha Christie");

        livroInformacoes.exibirDetalhes();
    }
}
