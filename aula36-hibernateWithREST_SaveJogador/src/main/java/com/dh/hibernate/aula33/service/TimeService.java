package com.dh.hibernate.aula33.service;

import com.dh.hibernate.aula33.model.Time;
import com.dh.hibernate.aula33.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TimeService {

    TimeRepository timeRepository;

    @Autowired
    public TimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    public Time salvarTime(Time time) {
        return timeRepository.save(time);
    }

    public List<Time> buscarTodosOsTimes() {
        return timeRepository.findAll();
    }

    public Optional<Time> buscarTimePorId(Integer id) {
        return timeRepository.findById(id);
    }

    public Time atualizarTime(Time time) {
        return timeRepository.save(time);
    }

    public void excluirTime(Integer id) {
        timeRepository.deleteById(id);
    }
}
