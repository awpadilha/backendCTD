package service;

import dao.IDao;
import model.Usuario;

public class UsuarioService{

    private IDao<Usuario> usuarioIDao;

    public UsuarioService(IDao<Usuario> usuarioIDao) {
        this.usuarioIDao = usuarioIDao;
    }

    public Usuario salvar(Usuario usuario) {
        usuarioIDao.salvar(usuario);
        return usuario;
    }
}
