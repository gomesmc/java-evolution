package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex08 {
    public static void main(String[] args) {
        ZonedDateTime horarioTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horarioTokyo.format(formatter);

        System.out.println("Horário atual em Tóquio: " + horarioFormatado);
    }
}
