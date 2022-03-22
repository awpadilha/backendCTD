package com.dhbrasil.mvc.aula22.service.impl;

import com.dhbrasil.mvc.aula22.model.Veiculo;
import com.dhbrasil.mvc.aula22.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(
                new Veiculo("Civic"),
                new Veiculo("City"),
                new Veiculo("HRV"));
    }
}
