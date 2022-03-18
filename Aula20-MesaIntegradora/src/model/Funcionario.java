package model;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String CPF;
    private String salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, String CPF, String salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
