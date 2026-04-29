package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate dataAutal = LocalDate.now();
        DateTimeFormatter dataAtualFormata = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data atual: " + dataAutal.format(dataAtualFormata));

        LocalDate dataEvento = LocalDate.of(2027, 03, 05);
        DateTimeFormatter dataEventoFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data do evento: " + dataEvento.format(dataEventoFormatada));

        if(dataEvento.isAfter(dataAutal)){
            System.out.println("O evento ainda vai acontecer");
        }else{
            System.out.println("O evento já passou");
        }
    }
}
