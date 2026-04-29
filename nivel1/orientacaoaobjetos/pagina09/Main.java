package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("O Agente Secreto");
        meuFilme.setAnoDeLancamento(2025);
        meuFilme.setDuracaoEmMinutos(161);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecinica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.printf("Média das avalicações: %.2f", meuFilme.pegaMedia());
    }
}
