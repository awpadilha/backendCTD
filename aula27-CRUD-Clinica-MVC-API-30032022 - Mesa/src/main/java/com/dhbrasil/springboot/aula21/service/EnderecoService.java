package com.dhbrasil.springboot.aula21.service;

import com.dhbrasil.springboot.aula21.resources.IDao;
import com.dhbrasil.springboot.aula21.model.Endereco;

import java.util.List;
import java.util.Optional;

public class EnderecoService {

    private IDao<Endereco> enderecoIDao;

    public EnderecoService(IDao<Endereco> enderecoIDao) {
        this.enderecoIDao = enderecoIDao;
    }

    public Endereco salvar(Endereco endereco){
        enderecoIDao.salvar(endereco);
        return endereco;
    }

    public Optional<Endereco> buscar(Integer id) {
        return enderecoIDao.buscar(id);
    }

    public List<Endereco> buscarTodos(){
        return enderecoIDao.buscarTodos();
    }

    public void excluir(Integer id) {
        enderecoIDao.excluir(id);
    }

    public Endereco atualizar(Endereco endereco) {
        return enderecoIDao.atualizar(endereco);
    }

}
