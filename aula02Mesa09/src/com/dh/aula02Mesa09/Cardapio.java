package com.dh.aula02Mesa09;

public abstract class Cardapio {

    private double preco;
    private String descricao;

    public Cardapio(double preço, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double preparacao() {
        montarPedido();
        return calcPrecoPedido();
    }

    public abstract void montarPedido();

    public double calcPrecoPedido(){
        return preco;
    }
}
