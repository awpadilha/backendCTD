package com.dhbrasil.springboot.aula21;

import com.dhbrasil.springboot.aula21.dao.impl.EnderecoDaoH2;
import com.dhbrasil.springboot.aula21.dao.impl.PacienteDaoH2;
import com.dhbrasil.springboot.aula21.model.Endereco;
import com.dhbrasil.springboot.aula21.model.Paciente;
import com.dhbrasil.springboot.aula21.service.PacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class Aula21ServicesPacientes {

	private static PacienteService pacienteService = new PacienteService(
			new PacienteDaoH2(
					new EnderecoDaoH2()));

	@Test
	void contextLoads() {
	}

	@Test
	public void carregarTresPacientes() {

		Endereco e1 = new Endereco(
				"Av. Eldorado", "445", "Centro",
				"São Paulo", "SP"
		);

		Paciente p1 = new Paciente("Carlos", "Moraes",
				"12365498785", new Date(), e1);

		pacienteService.salvar(p1);
	}

}
