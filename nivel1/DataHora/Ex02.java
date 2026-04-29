package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    public static void main(String[] args) {
        LocalDateTime dataEHoraAtual = LocalDateTime.now();

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data formatada: " + dataEHoraAtual.format(formatarData));

        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Hora formatada: " + dataEHoraAtual.format(formatarHora));
    }
}
