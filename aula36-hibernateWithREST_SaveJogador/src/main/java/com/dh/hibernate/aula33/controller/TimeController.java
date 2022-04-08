package com.dh.hibernate.aula33.controller;

import com.dh.hibernate.aula33.model.Time;
import com.dh.hibernate.aula33.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/times")
public class TimeController {

    private TimeService timeService;

    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @PostMapping
    public ResponseEntity<Time> salvar(@RequestBody Time time) {
        return ResponseEntity.ok(timeService.salvarTime(time));
    }

    @GetMapping
    public ResponseEntity<List<Time>> buscarTodos() {
        return ResponseEntity.ok(timeService.buscarTodosOsTimes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Time> buscarPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(timeService.buscarTimePorId(id).orElse(null));
    }

    @PutMapping
    public ResponseEntity<Time> atualizarTime(@RequestBody Time time) {
        ResponseEntity<Time> response = null;

        if (time.getId() != null && timeService.buscarTimePorId(time.getId()).isPresent()) {
            response = ResponseEntity.ok(timeService.atualizarTime(time));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirTime(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (timeService.buscarTimePorId(id).isPresent()) {
            timeService.excluirTime(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).
                    body("Time excluído com sucesso!");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

}
