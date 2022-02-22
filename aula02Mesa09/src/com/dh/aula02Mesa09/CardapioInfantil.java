package com.dh.aula02Mesa09;

public class CardapioInfantil extends Cardapio{

    private String brinquedo;
    private double custoBrinquedo;

    public CardapioInfantil(double preço, String descricao, String brinquedo, double custoBrinquedo) {
        super(preço, descricao);
        this.brinquedo = brinquedo;
        this.custoBrinquedo = custoBrinquedo;
    }

    @Override
    public void montarPedido(){
        System.out.println(getDescricao());
        System.out.println("Acrescenta brinquedo");
        System.out.println(brinquedo);
    }

    @Override
    public double calcPrecoPedido(){
        return super.calcPrecoPedido() + custoBrinquedo;
    }
}
