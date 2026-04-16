package br.com.cursoalura.exercicios.nivel1.apis.pagina09;

import com.google.gson.Gson;

public class Ex3 {
    public static void main(String[] args) {
        String jsonLivro = """
            {
            "titulo":"A Hora da Estrela",
            "autor": "Clarisse Lispector",
            "cidade": "Rio de Janeiro"
            }
            """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto do livro: " + livro);
    }
}

