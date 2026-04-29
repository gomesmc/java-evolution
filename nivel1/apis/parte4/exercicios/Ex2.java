package br.com.cursoalura.exercicios.nivel1.apis.parte4.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o id da criptomoeda que deseja ver: ");
        var cripto = scan.nextLine();

        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + cripto + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
