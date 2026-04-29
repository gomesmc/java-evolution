package br.com.cursoalura.exercicios.nivel1.DataHora;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {
    public static void main(String[] args) {

        LocalDate inicio = LocalDate.now();

        LocalDate dataEntrega = inicio.plusDays(15);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data de entrega: " + dataEntrega.format(formatter));
    }
}