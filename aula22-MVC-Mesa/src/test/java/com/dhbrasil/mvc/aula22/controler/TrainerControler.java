package com.dhbrasil.mvc.aula22.controler;


import com.dhbrasil.mvc.aula22.model.Veiculo;
import com.dhbrasil.mvc.aula22.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trainer")

public class TrainerControler {

    private TrainerService trainerService;

    @Autowired
    public TrainerControler(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Veiculo> buscarTodos(){
        return trainerService.listTrainer();
    }
}
