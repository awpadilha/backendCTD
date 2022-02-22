import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    // Atributos
    private String nome;
    private String sobrenome;
    private LocalDate idade;
    private List<String> colecao = new ArrayList<>();


    // Construtor


    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getter and Setters
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
        this.sobrenome = sobrenome; //atributo se trata da classe, escopo local, sendo recebido
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    public List<String> adicionarNome(Pessoa p) {
        // Aqui vem a lógica
        int var = p.getNome().length();
        int idade = p.calcIdade();

        if (var >= 5 && idade >= 18) {
            colecao.add(p.getNome());
            System.out.println(colecao);
        }
        return null;

    }

    // Método que calcula a idade
    public int calcIdade() {
        int idade = Period.between(
                this.idade, LocalDate.of(2022, 02, 21))
                .getYears();
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

