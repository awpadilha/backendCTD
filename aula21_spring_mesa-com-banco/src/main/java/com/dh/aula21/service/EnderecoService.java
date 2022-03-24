package com.dh.aula21.service;

import com.dh.aula21.dao.IDao;
import com.dh.aula21.model.Endereco;

import java.util.List;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        enderecoIDao.salvar(endereco);
        return endereco;
    }

    public void excluir(Integer id){
        enderecoIDao.excluir(id);
    }

    public List<Endereco> buscarTodos(){
        return enderecoIDao.buscarTodos();
    }

}
