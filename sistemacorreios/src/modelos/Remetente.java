package modelos;

public class Remetente extends Pessoa{
    public Remetente() {
    }

    public Remetente(String nome) {
        super(nome);
    }

    public Remetente(String cpf, String nome, Contato contato, Endereco endereco) {
        super(cpf, nome, contato, endereco);
    }
}
