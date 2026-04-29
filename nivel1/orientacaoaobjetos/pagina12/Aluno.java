package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina12;

public class Aluno {
    private String nome;
    private double notaUm;
    private double notaDois;
    private double notaTres;

    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome=nome;
        this.notaUm = nota1;
        this.notaDois=nota2;
        this.notaTres=nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }

    public double calcularMedia(){
        return (notaUm + notaDois + notaTres)/3;
    }

    public static void main(String[] args) {
        Aluno primeiroAluno = new Aluno("Sabrina Pereira", 8.0,9.2,7.5);
        Aluno segundoAluno = new Aluno("Arlindo Silva", 6.8,7.3,8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + primeiroAluno.getNome());
        System.out.println("Nota 1: " + primeiroAluno.getNotaUm());
        System.out.println("Nota 2: " + primeiroAluno.getNotaDois());
        System.out.println("Nota 3: " + primeiroAluno.getNotaTres());
        System.out.printf("Média: %.2f",  primeiroAluno.calcularMedia());

        System.out.println("\n\nAluno 2:");
        System.out.println("Nome: " + segundoAluno.getNome());
        System.out.println("Nota 1: " + segundoAluno.getNotaUm());
        System.out.println("Nota 2: " + segundoAluno.getNotaDois());
        System.out.println("Nota 3: " + segundoAluno.getNotaTres());
        System.out.printf("Média: %.2f",  segundoAluno.calcularMedia());
    }

}
