package br.com.cursoalura.exercicios.nivel1.DataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exemplo {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 5, 15);
        LocalDate dataSegundaParcela = LocalDate.now().plusDays(30);

        if(dataPrimeiraParcela.isBefore(LocalDate.now())){
            System.out.println("Anterior ao dia do vencimento");
        }else{
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data da compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        System.out.println("Data de conclusão compra: " + dataConclusaoCompra);

        ZonedDateTime dataCompraNY = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data compra NY: " + dataCompraNY);

        LocalTime inicio = LocalTime.of(9,0);
        LocalTime fim = LocalTime.of(16,30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente:" + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos");

        LocalDate dataPagamento = LocalDate.parse( "2026-10-30");
        Period periodo = Period.between(dataCompra, dataPagamento);
        System.out.println("Diferença em dias: " + periodo.getDays());
    }
}
