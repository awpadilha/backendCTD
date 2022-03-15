package test;

import dao.config.ConfigJDBC;
import dao.impl.HotelDaoH2;
import model.Hotel;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.HotelService;

import static org.junit.jupiter.api.Assertions.*;

class HotelServiceTest {

    private static final Logger LOGGER = Logger.getLogger(HotelServiceTest.class);

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
        Hotel hotel1 = hotelService.salvar(new Hotel(
                "Catamarã", "Das Tulipas",
                "151", "São Paulo", "SP", true ));
        LOGGER.info("Filial 1 cadastrada com sucesso!");

        Hotel hotel2 = hotelService.salvar(new Hotel(
                "Piracaia", "Das Violetas",
                "58", "Fortaleza", "CE", false ));
        LOGGER.info("Filial 2 cadastrada com sucesso!");

        Hotel hotel3 = hotelService.salvar(new Hotel(
                "Piracanjuba", "Das Acácias",
                "548", "Curitiba", "SP", true ));
        LOGGER.info("Filial 3 cadastrada com sucesso!");

        Hotel hotel4 = hotelService.salvar(new Hotel(
                "Ribeirinha", "Das Margaridas",
                "847", "Natal", "RN", false ));
        LOGGER.info("Filial 4 cadastrada com sucesso!");

        Hotel hotel5 = hotelService.salvar(new Hotel(
                "Torrinha", "Das Rosas",
                "897", "Ribeirão do Sul", "SP", true ));
        LOGGER.info("Filial 5 cadastrada com sucesso!");
    }
}

