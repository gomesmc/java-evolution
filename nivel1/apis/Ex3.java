package br.com.cursoalura.exercicios.nivel1.apis;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a receita desejada: ");
        String busca = scanner.nextLine().toLowerCase();

        String buscaTratada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

        String apiKey= "7a97ae672c5b5316968bf19a2cd88cef";

        String enderecoFilmes = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + buscaTratada;

        String enderecoSeries = "https://api.themoviedb.org/3/search/tv?api_key=SUA_CHAVE&query=" + apiKey + "&query=" + buscaTratada;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(enderecoFilmes))
                .build();

        HttpResponse<String> responseFilmes = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Resultado para Filmes:" );
        System.out.println(responseFilmes.body());

        HttpResponse<String> responseSeries = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Resultado de séries:");
        System.out.println(responseSeries.body());
    }
}
