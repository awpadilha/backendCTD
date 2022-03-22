package com.dhbrasil.mvc.aula22.controller;

import com.dhbrasil.mvc.aula22.model.Veiculo;
import com.dhbrasil.mvc.aula22.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class TrainerController {

    private VeiculoService veiculoService;

    @Autowired
    public TrainerController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping
    public List<Veiculo> buscarTodos(){
        return veiculoService.listVeiculo();
    }
}
