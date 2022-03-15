package test;

import dao.config.ConfigJDBC;
import dao.impl.UsuarioDaoH2;
import model.Usuario;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.UsuarioService;

class UsuarioServiceTest {

    private static final Logger LOGGER = Logger.getLogger(UsuarioServiceTest.class);

    private UsuarioService usuarioService = new UsuarioService(
            new UsuarioDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarUsuarioNoH2() {
        LOGGER.info("Cadastrando o usuario no H2...");
        Usuario usuario1 = usuarioService.salvar(new Usuario(
                "Av. Eldorado", "21",
                "São Paulo", "Morumbi"));
    }
}