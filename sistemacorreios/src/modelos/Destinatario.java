package modelos;

public class Destinatario extends Pessoa{
    public Destinatario() {
    }

    public Destinatario(String cpf, String nome, Contato contato, Endereco endereco) {
        super(cpf, nome, contato, endereco);
    }

    public void teste(){
        System.out.println("oi");
    }
}
