package br.com.cursoalura.exercicios.nivel1.apis;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import com.google.gson.Gson;

public class Ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um título que deseja buscar: ");
        String buscaTitulo = scan.nextLine();

        String buscaTratada = URLEncoder.encode(buscaTitulo, StandardCharsets.UTF_8);

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaTratada;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        Object resposta = gson.fromJson(response.body(), Object.class);
        System.out.println(resposta);
    }
}
