package br.com.cursoalura.exercicios.nivel1.apis.parte4.pagina09;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        String json = """
            "titulo": "Dom Casmurro",
            "autor": "Machado de Assis",
            "editora": {
                "nome": "Editora XYZ",
                "cidade": "Rio de Janeiro"
                }
            }
            """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(json, Livro.class);
        System.out.println("Objeto livro: " + livro);

    }
}
