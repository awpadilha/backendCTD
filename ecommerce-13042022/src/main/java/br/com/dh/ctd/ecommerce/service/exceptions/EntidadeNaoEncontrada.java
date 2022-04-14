package br.com.dh.ctd.ecommerce.service.exceptions;

public class EntidadeNaoEncontrada extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontrada(String msg) {
        super(msg);
    }
}
