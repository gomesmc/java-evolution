package br.com.cursoalura.exercicios.orientacaoaobjetos2;

public class Ex06 {
    String nome;
    String cargo;
    int nivelAcesso;

    public void infoFuncionario(String novoCargo, int novoNivel){
        System.out.println("""
                ---Antes da atualização---
                Nome: %s
                Cargo %s
                Nível de acesso: %d
                """.formatted(nome, cargo, nivelAcesso));

        this.cargo = novoCargo;
        this.nivelAcesso = novoNivel;

        System.out.println("""
                    ---Após atualização---
                    Nome: %s
                    Cargo %s
                    Nível de acesso: %d
                    """.formatted(nome, cargo, nivelAcesso));
    }


    public static void main(String[]args){
        Ex06 colaborador = new Ex06();

        colaborador.nome="Júlia Oliveira";
        colaborador.cargo="Desenvolvedor Júnior";
        colaborador.nivelAcesso=1;

        colaborador.infoFuncionario("Desenvolvedor Pleno", 2);
    }
}
