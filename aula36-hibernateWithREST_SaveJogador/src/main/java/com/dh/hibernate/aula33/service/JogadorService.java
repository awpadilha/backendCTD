package com.dh.hibernate.aula33.service;

import com.dh.hibernate.aula33.model.Jogador;
import com.dh.hibernate.aula33.repository.JogadorRepository;
import com.dh.hibernate.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    JogadorRepository jogadorRepository;
    TimeRepository timeRepository;

    @Autowired
    public JogadorService(JogadorRepository jogadorRepository, TimeRepository timeRepository) {
        this.jogadorRepository = jogadorRepository;
        this.timeRepository = timeRepository;
    }

    public Jogador salvarJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

}
