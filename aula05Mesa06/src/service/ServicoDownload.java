package service;

import model.Usuario;

public class ServicoDownload implements Download{

    @Override
    public void downloadMusica(Usuario usuario) {
        System.out.println("Usuário(a) " + usuario.getTipoUsuario());
    }

}
