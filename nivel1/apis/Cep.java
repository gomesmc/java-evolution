package br.com.cursoalura.exercicios.nivel1.apis;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Cep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP que deseja buscar: ");
        String cep = scanner.nextLine();

        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        if (response.statusCode() == 200) {

            String json = response.body();
            System.out.println("API: ");
            System.out.println(json);

            try (FileWriter writer = new FileWriter("cep.json")) {
                writer.write(json);
                System.out.println("Arquivo cep.json gerado com sucesso!");
            }

        } else {
            System.out.println("Erro ao consultar CEP!");
            System.out.println("Status HTTP: " + response.statusCode());
            System.out.println(response.body());
        }
    }
}