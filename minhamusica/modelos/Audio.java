package br.com.cursoalura.exercicios.minhamusica.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int curte(){
        totalCurtidas++;
        System.out.printf("\nTotal de curtidas atualizado: %d\n", totalCurtidas);
        return totalCurtidas;
    }

    public int reproduz(){
        totalReproducoes++;
        System.out.printf("Total de reproduções atualizado: %d", totalReproducoes);
        return totalReproducoes;
    }

}
