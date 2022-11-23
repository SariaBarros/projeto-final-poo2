package modelos;

public class Carteiro extends Pessoa{
    public Carteiro() {
    }

    public Carteiro(String cpf, String nome, Contato contato, Endereco endereco) {
        super(cpf, nome, contato, endereco);
    }
}
