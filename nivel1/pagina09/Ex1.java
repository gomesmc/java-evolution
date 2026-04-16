package br.com.cursoalura.exercicios.nivel1.pagina09;

import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("arquivo.txt");
        writer.write("Conteúdo a ser gravado no arquivo");
        writer.close();
        System.out.println(writer);
    }
}
