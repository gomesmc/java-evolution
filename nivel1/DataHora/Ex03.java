package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(18, 0);

        Duration diferencaHoraMinuto = Duration.between(inicio, fim);
        System.out.println("Diferença de horas e minutos entre esses dois horários é de: " + diferencaHoraMinuto.toHours()
        + " horas e " + diferencaHoraMinuto.toMinutesPart() + " minutos");
    }
}
