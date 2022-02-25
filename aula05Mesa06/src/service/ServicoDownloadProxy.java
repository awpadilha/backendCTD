package service;

import model.Usuario;

public class ServicoDownloadProxy  implements Download{

    @Override
    public void downloadMusica(Usuario usuario) {
        if(usuario.getTipoUsuario().equals("Premium")) {
            ServicoDownload download = new ServicoDownload();
            System.out.println("Usuario " + usuario.getNome()  + " possui direito de realizar o download. Assinante Premium");
            download.downloadMusica(usuario);
        } else {
            System.out.println("Usuario " + usuario.getNome() + " não possui a assinatura Premium");
        }
    }

}
