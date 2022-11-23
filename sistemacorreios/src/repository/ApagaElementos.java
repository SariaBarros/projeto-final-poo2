package repository;

import modelos.Carteiro;
import modelos.Destinatario;
import modelos.Postagem;
import modelos.Remetente;

import java.util.Scanner;

public class ApagaElementos {
    Scanner scanner = new Scanner(System.in);
    public void apagarElementos(Repository<Destinatario> destinatarioRepository,
                                  Repository<Remetente> remetenteRepository,
                                  Repository<Carteiro> carteiroRepository,
                                  Repository<Postagem> postagemRepository){
        System.out.println("Escolha o que deseja apagar:");
        System.out.println("1 - Destinatarios");
        System.out.println("2 - Remetentes");
        System.out.println("3 - Carteiros");
        System.out.println("4 - Postagens");
        int op = scanner.nextInt();
        switch (op){
            case 1:
                destinatarioRepository.imprimir();
                System.out.println("Entre com o indice a ser apagado: ");
                op = scanner.nextInt();
                Destinatario destinatario = destinatarioRepository.buscar(op);
                destinatarioRepository.deletar(destinatario);
                break;
            case  2:
                remetenteRepository.imprimir();
                System.out.println("Entre com o indice a ser apagado: ");
                op = scanner.nextInt();
                Remetente remetente = remetenteRepository.buscar(op);
                remetenteRepository.deletar(remetente);
                break;
            case 3:
                carteiroRepository.imprimir();
                System.out.println("Entre com o indice a ser apagado: ");
                op = scanner.nextInt();
                Carteiro carteiro = carteiroRepository.buscar(op);
                carteiroRepository.deletar(carteiro);
                break;
            case 4:
                postagemRepository.imprimir();
                System.out.println("Entre com o indice a ser apagado: ");
                op = scanner.nextInt();
                Postagem postagem = postagemRepository.buscar(op);
                postagemRepository.deletar(postagem);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }


}
