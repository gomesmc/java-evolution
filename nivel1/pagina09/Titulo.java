package br.com.cursoalura.exercicios.nivel1.pagina09;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    private String titulo;
    private String autor;

    public Titulo(String titulo, String autor){
        this.titulo = titulo;
        this.autor=autor;
    }

    public static void main(String[] args) {
        Titulo meuTitulo = new Titulo("Macunaíma", "Mario de Andrade");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(meuTitulo);
        System.out.println(json);
    }
}
