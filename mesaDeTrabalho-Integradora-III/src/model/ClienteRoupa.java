package model;

public class ClienteRoupa {

    private String tamanho;
    private String tipo;
    private boolean eNovo;
    private boolean importada;

    public ClienteRoupa(String importada) {
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String geteNovo() {
        return eNovo;
    }

    public void seteNovo(String eNovo) {
        this.eNovo = eNovo;
    }

    public String getImportada() {
        return importada;
    }

    public void setImportada(String importada) {
        this.importada = importada;
    }
}


