package testes;

import modelos.Pessoa;
import modelos.Remetente;
import repository.Repository;

public class TesteRepository {
    public static void main(String[] args) {
        Repository<Remetente> remetenteRepository = new Repository<>();

        remetenteRepository.salvar(new Remetente("Sandy"));
        remetenteRepository.salvar(new Remetente("Vitoria"));
        remetenteRepository.salvar(new Remetente("Barros"));

        remetenteRepository.imprimir();
        Remetente remetente2 = remetenteRepository.buscar(1);
        System.out.println(remetente2);

        remetenteRepository.deletar(remetente2);
        System.out.println("DELETANDO");
        System.out.println();
        System.out.println();
        remetenteRepository.imprimir();
    }
}
