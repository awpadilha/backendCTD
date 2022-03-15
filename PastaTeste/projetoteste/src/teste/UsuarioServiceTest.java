package teste;

import dao.config.ConfigJDBC;
import dao.impl.UsuarioDaoH2;
import model.Usuario;
import service.UsuarioService;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


class UsuarioServiceTest {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(UsuarioServiceTest.class));

    private UsuarioService usuarioService = new UsuarioService(
            new UsuarioDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarEnderecoNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Usuario endereco1 = usuarioService.salvar(new Usuario(
                "Av. Eldorado", "2154",
                "São Paulo", "Morumbi"));
    }
}