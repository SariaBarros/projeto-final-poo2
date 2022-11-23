package testes;

import modelos.Carteiro;
import modelos.Destinatario;
import modelos.Postagem;
import modelos.Remetente;
import repository.*;
import servicos.Tela;

import java.math.BigDecimal;
import java.util.Scanner;

public class SistemaCorreio {
    public static void main(String[] args) {
        int op;
        Repository<Destinatario> destinatarioRepository = new Repository<>();
        Repository<Remetente> remetenteRepository = new Repository<>();
        Repository<Carteiro> carteiroRepository = new Repository<>();
        Repository<Postagem> postagemRepository = new Repository<>();



        Scanner leitor = new Scanner(System.in);

        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        CadastroPostagem cadastroPostagem = new CadastroPostagem();
        Consultas consultas = new Consultas();
        ApagaElementos apagaElementos = new ApagaElementos();
        
        Tela.mostrarTelaInicial();
        do {

            Tela.mostrarMenu();
            op = leitor.nextInt();
            switch (op){
                case 1:
                    Destinatario destinatario = cadastroPessoas.cadastrarDestinatario();
                    destinatarioRepository.salvar(destinatario);

                    break;
                case 2:
                    Remetente remetente = cadastroPessoas.cadastrarRemetente();
                    remetenteRepository.salvar(remetente);
                    break;
                case 3:
                    Carteiro carteiro = cadastroPessoas.cadastrarCarteiro();
                    carteiroRepository.salvar(carteiro);
                    break;
                case 4:
                    Postagem postagem = cadastroPostagem.cadastrarPostagem(remetenteRepository, destinatarioRepository);
                    postagemRepository.salvar(postagem);
                    break;
                case 5:
                    consultas.realizarConsultas(destinatarioRepository, remetenteRepository, carteiroRepository, postagemRepository);
                    break;
                case 6:
                    apagaElementos.apagarElementos(destinatarioRepository,remetenteRepository, carteiroRepository, postagemRepository);
                    break;
                case 9:
                    System.out.println("Saindo do Sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }


        }while (op != 9);
    }
}
