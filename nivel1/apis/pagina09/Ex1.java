package br.com.cursoalura.exercicios.nivel1.apis.pagina09;

import com.google.gson.Gson;

public class Ex1 {
    public static void main(String[] args) {

        String json= """
                {
                "nome": "Fernando Castelo Branco",
                "idade": 29,
                "cidade": "Rio de Janeiro",
                "profissao":"desenvolvedor"
                }
                """;

        Gson gson = new Gson();

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }

}
