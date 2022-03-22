package com.dhbrasil.mvc.aula22.service.impl;

import com.dhbrasil.mvc.aula22.model.Veiculo;
import com.dhbrasil.mvc.aula22.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Veiculo> listTrainer() {
        return Arrays.asList(
                new Veiculo("Patrick"),
                new Veiculo("Louis"),
                new Veiculo("Ted"));
    }

}

