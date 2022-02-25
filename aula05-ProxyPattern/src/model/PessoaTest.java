package model;

import org.junit.jupiter.api.Test;
import service.ServicoVacinarProxy;
import service.Vacinar;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Date dataVac = new Date();

    @Test
    public void vac() {
        Pessoa p1 = new Pessoa("Christh", "Teixeira", "1122334455", dataVac, "Pfizer");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getnomeVacina());
        System.out.println(p1.toString());

    }


}