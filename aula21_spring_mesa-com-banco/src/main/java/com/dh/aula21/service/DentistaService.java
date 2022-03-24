package com.dh.aula21.service;

import com.dh.aula21.dao.IDao;
import com.dh.aula21.model.Dentista;

import java.util.List;

public class DentistaService {

    private IDao<Dentista> dentistaIDao;

    public DentistaService(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    public Dentista salvar(Dentista dentista){
        dentistaIDao.salvar(dentista);
        return dentista;
    }

    public void excluir(Integer id){
        dentistaIDao.excluir(id);
    }


    public List<Dentista> buscarTodos(){
        return dentistaIDao.buscarTodos();
    }


}
