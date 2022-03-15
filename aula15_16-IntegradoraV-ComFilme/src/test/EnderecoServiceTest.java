package test;

import dao.config.ConfigJDBC;
import dao.impl.EnderecoDaoH2;
import dao.impl.FilmeDaoH2;
import model.Endereco;
import model.Filme;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.EnderecoService;
import service.FilmeService;

class EnderecoServiceTest {

    private static final Logger LOGGER = Logger.getLogger(EnderecoServiceTest.class);

    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2( new ConfigJDBC()));
    private FilmeService filmeService = new FilmeService(new FilmeDaoH2( new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarEnderecoNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Endereco endereco = new Endereco( "Av. Eldorado", "2154", "São Paulo", "Morumbi");
        Endereco enderecoRetornado = enderecoService.salvar(endereco);
        LOGGER.info("Endereco criado com id " + enderecoRetornado.getId());
    }

    @Test
    public void cadastrarFilmeNoH2() {
        Filme filme = new Filme("Escola de super herois", "Um bom filme", 12);
        Filme filmeCriado = filmeService.salvar(filme);
        LOGGER.info("Filme criado com id " + filmeCriado.getId());
    }
}