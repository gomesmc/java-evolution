package br.com.cursoalura.exercicios.nivel1.orientacaoaobjetos.pagina10;

public class VerificadorPrimo extends NumerosPrimos{

    public void verificarSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println(numero + " é primo");
        }else{
            System.out.println(numero + " náo é primo");
        }
    }
}
