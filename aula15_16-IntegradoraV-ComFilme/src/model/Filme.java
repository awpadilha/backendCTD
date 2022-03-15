package model;

public class Filme {
    private int id;
    private String nome;
    private String descricao;
    private int idadeMinima;

    public Filme(String nome, String descricao, int idadeMinima) {
        this.nome = nome;
        this.descricao = descricao;
        this.idadeMinima = idadeMinima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
}
