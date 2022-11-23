package repository;

import modelos.Carteiro;
import modelos.Destinatario;
import modelos.Postagem;
import modelos.Remetente;

import java.util.Scanner;

public class Consultas {
    Scanner scanner = new Scanner(System.in);
    public void realizarConsultas(Repository<Destinatario> destinatarioRepository,
                                  Repository<Remetente> remetenteRepository,
                                  Repository<Carteiro> carteiroRepository,
                                  Repository<Postagem> postagemRepository){
        System.out.println("Escolha a consulta que deseja realizar:");
        System.out.println("1 - Destinatarios");
        System.out.println("2 - Remetentes");
        System.out.println("3 - Carteiros");
        System.out.println("4 - Postagens");
        int op = scanner.nextInt();
        switch (op){
            case 1:
                destinatarioRepository.imprimir();
                break;
            case  2:
                remetenteRepository.imprimir();
                break;
            case 3:
                carteiroRepository.imprimir();
                break;
            case 4:
                postagemRepository.imprimir();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

}
