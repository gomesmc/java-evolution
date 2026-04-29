package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina12;

public class IdadePessoa {
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

    public void verificadorDeIdade(){
        if(idade >=18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoaEIdade = new IdadePessoa();

        pessoaEIdade.setIdade(18);
        pessoaEIdade.verificadorDeIdade();

        pessoaEIdade.setIdade(15);
        pessoaEIdade.verificadorDeIdade();
    }
}
