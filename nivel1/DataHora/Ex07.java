package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2026,04,20);
        LocalDate dataLembrete = dataVencimento.minusDays(10);
        DateTimeFormatter lembreteFormatado = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data do lembrete: " + dataLembrete.format(lembreteFormatado));
    }
}
