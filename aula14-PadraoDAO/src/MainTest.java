import dao.ConfigJDBC;
import dao.impl.MedicamentoDaoH2;
import model.Medicamento;
import org.junit.jupiter.api.Test;
import service.MedicamentoService;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    MedicamentoService medicamentoService = new MedicamentoService(
            new MedicamentoDaoH2(
                    new ConfigJDBC()));

    @Test
    void cadastrar() {
        Medicamento medicamento = new Medicamento(
                "Ibuprofeno", "Aché", 395, 35.7);

        medicamentoService.salvar(medicamento);
    }

}