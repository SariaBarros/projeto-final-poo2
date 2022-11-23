package repository;

import modelos.*;

import java.util.Scanner;

public class CadastroPessoas {
    Scanner scanner = new Scanner(System.in);
    public Destinatario cadastrarDestinatario(){


        System.out.println("==============================================");
        System.out.println("========== Cadastro do Destinatário ==========");
        System.out.println("==============================================");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informações de contato: ");
        System.out.println("Número de telefone: ");
        String numTelefone = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informaçoes de Endereço: ");
        System.out.println("Rua:");
        String rua = scanner.next();

        System.out.println("Número:");
        String numero = scanner.next();

        System.out.println("Cep:");
        String cep = scanner.next();

        System.out.println("Bairro: ");
        String bairro = scanner.next();

        System.out.println("Estado:");
        String estado = scanner.next();

         Destinatario destinatario = new Destinatario(cpf, nome, new Contato(numTelefone, email), new Endereco(rua, numero, cep, bairro, estado)) {
         };

        return destinatario;
    }
    public Remetente cadastrarRemetente(){


        System.out.println("==============================================");
        System.out.println("========== Cadastro do Remetente ==========");
        System.out.println("==============================================");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informações de contato: ");
        System.out.println("Número de telefone: ");
        String numTelefone = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informaçoes de Endereço: ");
        System.out.println("Rua:");
        String rua = scanner.next();

        System.out.println("Número:");
        String numero = scanner.next();

        System.out.println("Cep:");
        String cep = scanner.next();

        System.out.println("Bairro: ");
        String bairro = scanner.next();

        System.out.println("Estado:");
        String estado = scanner.next();

        Remetente remetente = new Remetente(cpf, nome, new Contato(numTelefone, email), new Endereco(rua, numero, cep, bairro, estado)) {
        };

        return remetente;
    }

    public Carteiro cadastrarCarteiro(){


        System.out.println("==============================================");
        System.out.println("========== Cadastro do Carteiro ==========");
        System.out.println("==============================================");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        System.out.println("Digite seu cpf: ");
        String cpf = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informações de contato: ");
        System.out.println("Número de telefone: ");
        String numTelefone = scanner.next();
        System.out.println("Email: ");
        String email = scanner.next();

        System.out.println("==============================================");
        System.out.println("Digite suas informaçoes de Endereço: ");
        System.out.println("Rua:");
        String rua = scanner.next();

        System.out.println("Número:");
        String numero = scanner.next();

        System.out.println("Cep:");
        String cep = scanner.next();

        System.out.println("Bairro: ");
        String bairro = scanner.next();

        System.out.println("Estado:");
        String estado = scanner.next();

        Carteiro carteiro = new Carteiro(cpf, nome, new Contato(numTelefone, email), new Endereco(rua, numero, cep, bairro, estado)) {
        };

        return carteiro;
    }
}
