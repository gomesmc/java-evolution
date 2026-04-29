package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Carro {

    private String nome;
    private String cor;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fichaTecnica(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Cor: %s\n", cor);
        System.out.printf("Idade: %d\n", idade);
    }

    public int calcularIdade(int anoAtual){
       int idadeAtualDoCarro = anoAtual - this.idade;
        return idadeAtualDoCarro;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setNome("Fusca");
        meuCarro.setCor("Amarelo");
        meuCarro.setIdade(1938);

        meuCarro.fichaTecnica();
        System.out.printf("Idade do %s: %d anos",meuCarro.getNome(), meuCarro.calcularIdade(2026) );

    }
}
