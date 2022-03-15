package test;

import dao.config.ConfigJDBC;
import dao.impl.EnderecoDaoH2;
import model.Endereco;
import org.junit.jupiter.api.Test;
import service.EnderecoService;

import java.util.logging.Logger;

class EnderecoServiceTest {

    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);

    private EnderecoService enderecoService = new EnderecoService(
            new EnderecoDaoH2(
                    new ConfigJDBC()));

    @Test
    public void cadastrarEnderecoNoH2() {
        Endereco endereco1 = enderecoService.salvar(new Endereco(
                "Av. Eldorado", "2154",
                "São Paulo", "Morumbi"));
    }
}
