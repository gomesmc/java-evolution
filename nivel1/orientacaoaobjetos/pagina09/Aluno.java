package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina09;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void exibeInformacoes(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d", idade);
    }

    public static void main(String[] args) {
        Aluno alunos = new Aluno();

        alunos.setNome("Samuel dos Santos");
        alunos.setIdade(7);
        alunos.exibeInformacoes();
    }
}