package modelos;

public abstract class Pessoa {
    private String cpf;
    private String nome;
    private Contato contato;

    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome, Contato contato, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }





    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                '}';
    }
}
