package com.dh.hibernate.aula33.controller;

import com.dh.hibernate.aula33.model.Jogador;
import com.dh.hibernate.aula33.service.JogadorService;
import com.dh.hibernate.aula33.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    private JogadorService jogadorService;
    private TimeService timeService;

    @Autowired
    public JogadorController(JogadorService jogadorService, TimeService timeService) {
        this.jogadorService = jogadorService;
        this.timeService = timeService;
    }

    @PostMapping
    public ResponseEntity<Jogador> salvar(@RequestBody Jogador jogador) {
        timeService.salvarTime(jogador.getTime());
        return ResponseEntity.ok(jogadorService.salvarJogador(jogador));
    }

}
