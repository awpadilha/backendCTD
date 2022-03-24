package com.dh.aula21;

import com.dh.aula21.dao.impl.DentistaDaoH2;
import com.dh.aula21.dao.impl.EnderecoDaoH2;
import com.dh.aula21.dao.impl.UsuarioDaoH2;
import com.dh.aula21.model.Dentista;
import com.dh.aula21.model.Endereco;
import com.dh.aula21.model.Usuario;
import com.dh.aula21.service.DentistaService;
import com.dh.aula21.service.EnderecoService;
import com.dh.aula21.service.UsuarioService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Aula21ApplicationTests {

	private static DentistaService dentistaService = new DentistaService(new DentistaDaoH2());
	private static EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2());
	private static UsuarioService usuarioService = new UsuarioService(new UsuarioDaoH2());

	@Test
	void contextLoads() {
	}

	@Test
	public void carregarTresDentistas(){
		Dentista dentista1 = new Dentista("Dafne", "d@gmail.com", 2337, 0);
		Dentista dentista2 = new Dentista("Felipe", "f@gmail.com", 9786, 1);
		Dentista dentista3 = new Dentista("Maria", "m@gmail.com", 1784, 1);

		dentistaService.salvar(dentista1);
		dentistaService.salvar(dentista2);
		dentistaService.salvar(dentista3);

	}

	@Test
	public void trazerTodosOsDentistas(){
		System.out.println(dentistaService.buscarTodos());
	}

	@Test
	public void excluirDentista(){
		dentistaService.excluir(2);
	}

	@Test
	public  void  carregarTresEnderecos(){
		Endereco enderco1 = new Endereco("rua A", "1623", "Porto Alegre", "Centro", "RS");
		Endereco enderco2 = new Endereco("rua B", "98", "São Paulo", "Moema", "SP");
		Endereco enderco3 = new Endereco("rua C", "245", "Belo horizonte", "Savassi", "MG");

		enderecoService.salvar(enderco1);
		enderecoService.salvar(enderco2);
		enderecoService.salvar(enderco3);
	}

	@Test
	public void trazerTodosOsEnderecos(){
		System.out.println(enderecoService.buscarTodos());
	}

	@Test
	public void excluirEndereco(){
		enderecoService.excluir(2);
	}

	@Test
	public  void  carregarTresUsuarios(){
		Usuario usuario1 = new Usuario("Dafne", "d@gmail.com", "1234", 1);
		Usuario usuario2 = new Usuario("Felipe", "f@gmail.com", "5678", 0);
		Usuario usuario3 = new Usuario("Maria", "m@gmail.com", "9012", 1);

		usuarioService.salvar(usuario1);
		usuarioService.salvar(usuario2);
		usuarioService.salvar(usuario3);
	}

	@Test
	public void trazerTodosOsUsuarios(){
		System.out.println(usuarioService.buscarTodos());
	}

	@Test
	public void excluirUsuario(){
		usuarioService.excluir(2);
	}
}
