package model;

public class Usuario {

    private int usuarioID;
    private String nome;
    private String tipoUsuario;

    public Usuario(int usuarioID, String nome, String tipoUsuario) {
        this.usuarioID = usuarioID;
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "usuarioID=" + usuarioID +
                ", nome='" + nome + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}

