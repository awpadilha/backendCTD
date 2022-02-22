package com.dh.aula02Mesa09;

public class CardapioVegetariano extends Cardapio {

    private double custoEmbalagem;

    public CardapioVegetariano(double preço, String descricao, double custoEmbalagem) {
        super(preço, descricao);
        this.custoEmbalagem = custoEmbalagem;
    }

    @Override
    public void montarPedido(){
        System.out.println(getDescricao());
        System.out.println("Acrescenta embalagem e consdimentos especiais ");
    }

    @Override
    public double calcPrecoPedido() {
        return super.calcPrecoPedido() + custoEmbalagem + super.calcPrecoPedido() * 0.01;
    }
}
