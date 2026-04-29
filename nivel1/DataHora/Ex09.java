package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Ex09 {
    public static void main(String[] args) {
       ZonedDateTime systemTime = ZonedDateTime.now();

       ZonedDateTime sidneyTime = systemTime.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");


        System.out.println("Horário atual do sistema: " + systemTime.format(formatter));
        System.out.println("Horário atual em Sidney - Austrália: " + sidneyTime.format(formatter));
    }
}
