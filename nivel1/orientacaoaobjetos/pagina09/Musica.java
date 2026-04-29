package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Musica {
    private String titulo;
    private int anoDeLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void fichaTecnica(){
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Título: %d", anoDeLancamento);
    }

    public void avaliar(double nota){
        this.avaliacao += nota;
        numAvaliacoes++;
    }

    public double calculaMedia(){
        double media = avaliacao / numAvaliacoes;
        return media;
    }

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Sweet Child O'Mine");
        minhaMusica.setAnoDeLancamento(1988);
        minhaMusica.avaliar(8.0);
        minhaMusica.avaliar(9.3);
        minhaMusica.fichaTecnica();
        System.out.println("\nMédia das avaliações: " + minhaMusica.calculaMedia());

    }

}
