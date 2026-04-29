package br.com.cursoalura.exercicios.orientacaoaobjetos2;

import java.util.Scanner;

public class Ex04 {
    String local;
    double temperaturaAtual;

    public void infoTemperatura(){
        System.out.printf("""
                Sensor no local: %s
                Temperatura: %s
                """, local, temperaturaAtual);

        if(temperaturaAtual > 37.5){
            System.out.print("Alerta: Temperatura acima do limite!");
        }else{
            System.out.println("Temperatura ok");
        }
    }

    public static void main(String[] args) {
        Ex04 sensor = new Ex04();

        sensor.local="Setor A";
        sensor.temperaturaAtual=39.5;
        sensor.infoTemperatura();

        sensor.local= "Setor c";
        sensor.temperaturaAtual=36.0;
        System.out.println("\n");
        sensor.infoTemperatura();

    }
}
