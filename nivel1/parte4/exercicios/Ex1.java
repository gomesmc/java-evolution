package br.com.cursoalura.exercicios.nivel1.parte4.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = leitura.nextLine();
        var tituloLivroFormatado = tituloLivro.replace(" ", "+");
        //Quando o título do livro for composto, trocar o espaço por + para conseguir buscar o título

        String chave = "AIzaSyDDn7f33xTw8Mg0XzZCkqBXswINckTLuRk";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivroFormatado + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
