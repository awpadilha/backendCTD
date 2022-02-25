package model;

import org.junit.jupiter.api.Test;
import service.Download;
import service.ServicoDownloadProxy;


import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    public void down() {
        Usuario u1 = new Usuario(01, "João", "Premium");
        Usuario u2 = new Usuario(02, "Carlos", "Free");
        Download download = new ServicoDownloadProxy();
        download.downloadMusica(u1);
        download.downloadMusica(u2);
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }

}