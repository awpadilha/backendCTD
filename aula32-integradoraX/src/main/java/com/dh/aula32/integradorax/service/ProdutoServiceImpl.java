package com.dh.aula32.integradorax.service;

import com.dh.aula32.integradorax.model.Produto;
import com.dh.aula32.integradorax.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepositorio produtoRepositorio;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepositorio produtoRepositorio) {
        this.produtoRepositorio = produtoRepositorio;
    }

    @Override
    public void salvar(Produto produto) {
        produtoRepositorio.save(produto);
    }

}
