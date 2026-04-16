package br.com.cursoalura.exercicios.nivel1.pagina10;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem;

    public SenhaInvalidaException(String msg){
        this.mensagem=msg;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
