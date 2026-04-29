package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate vencimento = LocalDate.of(2026, 04, 25);
        LocalDate adicionarMes = vencimento.plusMonths(06);
        DateTimeFormatter dataAjustada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data de vencimento:" + adicionarMes.format(dataAjustada));
    }
}
