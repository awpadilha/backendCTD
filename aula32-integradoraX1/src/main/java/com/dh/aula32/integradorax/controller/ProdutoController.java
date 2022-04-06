package com.dh.aula32.integradorax.controller;

import com.dh.aula32.integradorax.model.Produto;
import com.dh.aula32.integradorax.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<?> salvarProduto(@RequestBody Produto produto) {
        produtoService.salvar(produto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
