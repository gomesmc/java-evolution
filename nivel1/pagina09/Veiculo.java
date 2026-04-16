package br.com.cursoalura.exercicios.nivel1.pagina09;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
    }

    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Volkswagen", "Gol", 2003);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String meuJson = gson.toJson(meuVeiculo);
        System.out.println(meuJson);
    }


}
