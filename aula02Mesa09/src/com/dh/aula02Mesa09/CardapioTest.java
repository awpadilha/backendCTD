package com.dh.aula02Mesa09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardapioTest {

    @Test
    void Cardapios(){
        Cardapio cardapio = new CardapioAdulto(20, "bife com batata frita");

        cardapio.calcPrecoPedido();


    }

}