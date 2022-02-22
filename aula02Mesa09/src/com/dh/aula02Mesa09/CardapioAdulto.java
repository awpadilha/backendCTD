package com.dh.aula02Mesa09;

public class CardapioAdulto extends Cardapio {

    public CardapioAdulto(double preço, String descricao) {
        super(preço, descricao);
    }

    @Override
    public void montarPedido() {
        System.out.println(getDescricao());
    }


}
