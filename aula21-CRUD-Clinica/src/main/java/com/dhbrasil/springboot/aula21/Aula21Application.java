package com.dhbrasil.springboot.aula21;

import com.dhbrasil.springboot.aula21.model.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Aula21Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula21Application.class, args);
	}
		@GetMapping
		public String Ola() {
			return "CTD 2022 c/ SpringBoot Framework!";
		}


	List<Endereco> enderecos = new ArrayList<>();

	Endereco endereco1 = new ArrayList<>();
	endereco1.setRua()


	//Salvar endereço cliente/dentista em um arquivo
	FileOutputStream fo = null;

        try {
		fo = new FileOutputStream("OutputFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		oos.writeObject(enderecos);
	}
        catch (
	FileNotFoundException e) {
		System.out.println("ERROR: " + e.getMessage());
	}
        catch (Exception e) {
		System.out.println("ERROR: " + e.getMessage());
	}

	}


