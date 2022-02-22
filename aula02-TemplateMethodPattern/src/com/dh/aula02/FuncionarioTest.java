package com.dh.aula02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void Calculos() {

        Funcionario func = new Efetivo("Odair", "Antunes", "55201", 3000.0, 1000.0, 500.0);

        func.pagamentoSalario();

        func = new Contratado("Marlene", "Peixoto", "41528", 110.0, 50);
        func.pagamentoSalario();;

    }

}

