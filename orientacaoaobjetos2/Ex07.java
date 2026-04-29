package br.com.cursoalura.exercicios.orientacaoaobjetos2;

import java.util.ArrayList;
import java.util.List;

public class Ex07 {
    String descricao;
    boolean concluida;

    public void status(){
        if(concluida){
            System.out.printf("Tarefa: %s - Status: Concluída\n", descricao);
        }else{
            System.out.printf("Tarefa: %s - Status: Pendente\n",descricao);
        }
    }

    public static void main(String[]args){

        Ex07 tarefa1 = new Ex07();

        tarefa1.descricao="Estudar Java";
        tarefa1.concluida=false;

        Ex07 tarefa2 = new Ex07();
        tarefa2.descricao="Fazer exercícios";
        tarefa2.concluida=true;

        List<Ex07> listaDeTarefas = new ArrayList<>();
        listaDeTarefas.add(tarefa1);
        listaDeTarefas.add(tarefa2);

        for(Ex07 t : listaDeTarefas){
            t.status();
        }
    }
}
