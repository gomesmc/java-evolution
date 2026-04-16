package br.com.cursoalura.exercicios.nivel1.parte4.pagina09;

import com.google.gson.Gson;

public class Ex1 {
    public static void main(String[] args) {
        String jsonPessoa = """
                {
                "nome":"Rodrigo",
                "idade":"20",
                "cidade":"Rio de Janeiro"
                }
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
