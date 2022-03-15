package test;

import dao.config.ConfigJDBC;
import dao.impl.HotelDaoH2;
import model.Hotel;
import org.apache.log4j.BasicConfigurator;
import service.HotelService;

import java.util.logging.Logger;

public class HotelServiceTest {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(HotelServiceTest.class));

    private HotelService hotelService = new HotelService(
            new HotelDaoH2(
                    new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void cadastrarEnderecoNoH2() {
        LOGGER.info("Cadastrando o endereço no H2...");
        Hotel endereco1 = hotelService.salvar(new Hotel(
                "Hotel Grandes nações", "Rua 31",
                "214 - A ", "Brasília", "DF", true));
    }


}