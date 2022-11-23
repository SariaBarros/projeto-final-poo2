package repository;

import modelos.Destinatario;
import modelos.Postagem;
import modelos.Remetente;
import servicos.EntregaComum;
import servicos.EntregaSedex12;
import servicos.EntregaSedexHoje;

import java.math.BigDecimal;
import java.util.Scanner;

public class CadastroPostagem {
    Scanner scanner = new Scanner(System.in);


        EntregaComum entregaComum = new EntregaComum();
        EntregaSedex12 entregaSedex12 = new EntregaSedex12();
        EntregaSedexHoje entregaSedexHoje = new EntregaSedexHoje();
    public Postagem cadastrarPostagem(Repository<Remetente> repositoryRemetente, Repository<Destinatario> repositoryDestinatario){
        Postagem postagem;

        System.out.println("Escolha o número de um remetende cadastrado");
        repositoryRemetente.imprimir();
        int opRemetente = scanner.nextInt();

        System.out.println("Escolha o número de um destinatario cadastrado");
        repositoryDestinatario.imprimir();
        int opDestinatario = scanner.nextInt();

        System.out.println("Escolha um tipo de pagamento");
        System.out.println("1 - Entrega Comum");
        System.out.println("2 - Entrega Sedex 12");
        System.out.println("3 - Entrega Sedex Hoje");
        int opTipoEntrega = scanner.nextInt();
        BigDecimal valorEntrega;
        switch (opTipoEntrega){
            case 1:
                valorEntrega = entregaComum.calcularEntrega();
                break;
            case 2:
                valorEntrega = entregaSedex12.calcularEntrega();
                break;
            case 3:
                valorEntrega = entregaSedexHoje.calcularEntrega();
                break;
            default:
                System.out.println("Valor de entrada inválido, será aplicado a EntregaComum");
                valorEntrega = entregaComum.calcularEntrega();
        }
        postagem = new Postagem(repositoryRemetente.buscar(opRemetente), repositoryDestinatario.buscar(opDestinatario), valorEntrega);


        return postagem;
    }
}
