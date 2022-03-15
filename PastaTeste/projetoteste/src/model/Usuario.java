package model;

public class Usuario {
    private Integer id;
    private String nome;
    private String idade;
    private String sexo;
    private String datanascimento;

    public Usuario(){}

    public Usuario(String nome, String idade, String sexo, String datanascimento) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
    }

    public Usuario(Integer id, String nome, String idade, String sexo, String datanascimento) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.datanascimento = datanascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                '}';
    }
}
