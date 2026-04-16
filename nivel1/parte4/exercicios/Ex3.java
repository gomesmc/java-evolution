package br.com.cursoalura.exercicios.nivel1.parte4.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a receita que deseja ver: ");
        var receita = scan.nextLine();
        var receitaFormatada = receita.replace(" ", "+");

        String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receitaFormatada;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
