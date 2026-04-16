package br.com.cursoalura.exercicios.nivel1.apis;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a moeda desejada(exemplo: EUR, USD, BRL): ");
        String moeda = scanner.nextLine().toLowerCase();

        String endereco = "https://api.frankfurter.dev/v1/latest?base=" + moeda + "&symbols=BRL";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();

        System.out.println(response.body());
    }
}
