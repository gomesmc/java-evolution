package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex05 {
    String nome;
    double nota1;
    double nota2;

    public void infoAluno(){
        double media = (nota1 + nota2)/2;
        System.out.println("""
                Nome do aluno: %s
                Nota 1: %.2f
                Nota 2: %.2f
                Média: %.1f
                """.formatted(nome, nota1, nota2, media));

        if(media >=4){
            System.out.println("Situação: aprovado");
        }else{
            System.out.println("Situação: reprovado");
        }
    }

    public static void main(String[]args){

        Ex05 aluno = new Ex05();

        aluno.nome="João Silva";
        aluno.nota1=6.5;
        aluno.nota2=7.5;

        aluno.infoAluno();
    }
}
