package br.com.cursoalura.exercicios.nivel1.apis.parte4.pagina09;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Ex2 {
    public static void main(String[] args) {

        String json = """
                {
                "nome":"Rodrigo",
                "idade":"20",
                "cidade":"Rio de Janeiro"
                """;

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println("Objeto pessoa: " + pessoa);
    }
}
