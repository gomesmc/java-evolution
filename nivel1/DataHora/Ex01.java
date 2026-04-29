package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01 {
    public static void main(String[] args) {

        String tarefa = "Enviar relatório semanal";
        LocalDateTime dataHoraExatas = LocalDateTime.now();

        LocalDate data = dataHoraExatas.toLocalDate();
        LocalTime hora = dataHoraExatas.toLocalTime();

        System.out.println("Tarefa: " + tarefa);
        System.out.println("Data atual: " + data);
        System.out.println("Hora atual: " + hora);

    }
}
