package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina10;

public class TesteDosNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(2);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(2);
        System.out.println("O próximo primo após 2 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
