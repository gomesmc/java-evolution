package br.com.cursoalura.exercicios.nivel1.listasecolecoes.pagina10;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return this.nome + " tem " + this.idade + " anos";
    }
}
