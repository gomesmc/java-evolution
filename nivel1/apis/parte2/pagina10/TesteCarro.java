package br.com.cursoalura.exercicios.nivel1.apis.parte2.pagina10;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModeloCarro("Volkswagen");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.informacoesModeloCarro();
    }
}