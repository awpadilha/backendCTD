package com.dh.aula21.service;

import com.dh.aula21.dao.IDao;
import com.dh.aula21.model.Usuario;

import java.util.List;

public class UsuarioService {

    private IDao<Usuario> usuarioIDao;

    public UsuarioService(IDao<Usuario> usuarioIDao) {
        this.usuarioIDao = usuarioIDao;
    }

    public Usuario salvar(Usuario usuario){
        usuarioIDao.salvar(usuario);
        return usuario;
    }

    public void excluir(Integer id){
        usuarioIDao.excluir(id);
    }

    public List<Usuario> buscarTodos(){
        return usuarioIDao.buscarTodos();
    }
}
