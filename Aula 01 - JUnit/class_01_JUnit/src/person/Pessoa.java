package person;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

// Crie um aplicativo com uma pessoa para ser salva em uma coleção, apenas se a pessoa for maior de idade
// (18 anos) e o nome contiver 5 letras ou mais. Por exemplo, ''Arthur'' deve ser salvo.

// Crie um teste que instancia 10 pessoas:
// (a) 5 delas devem ter um nome com menos de 5 letras.
// (b) As outras 5 pessoas devem ter um nome de 5 letras ou mais.
// (c) Apenas 2 das pessoas com nomes com mais de 4 letras devem ser maiores de idade.
// (d) Faça uma asserção confirmando que apenas 2 pessoas estão na lista.

public class Pessoa {
    /** Atributos **/
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    static List<String> colecao = new ArrayList<>();

    // Constructor
    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    /** Getters/Setters **/
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /** Methods **/
    // (1) Year calculator
    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    // (2) Add Name
    public String adicionarNome(Pessoa pessoa) {
        int tamanhoNome = pessoa.getNome().length();
        int idade = pessoa.calcularIdade();

        if (tamanhoNome > 4 && idade > 17) {
            colecao.add(pessoa.getNome());
            System.out.println(pessoa.getNome());
            return pessoa.getNome();
        }

        return null;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "\nnome: " + nome +
                "\nsobrenome: " + sobrenome +
                "\ndata de nascimento: " + dataNascimento +
                "\nidade: " + calcularIdade() + "\n";
    }
}
