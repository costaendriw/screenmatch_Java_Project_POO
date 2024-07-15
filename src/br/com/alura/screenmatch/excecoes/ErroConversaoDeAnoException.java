package br.com.alura.screenmatch.excecoes;

public class ErroConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErroConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }


    public String getMensagem() {
        return this.mensagem;
    }
}
