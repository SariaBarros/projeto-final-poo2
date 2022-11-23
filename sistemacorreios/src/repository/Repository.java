package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repository<T>{
    private List<T> lista = new ArrayList<>();
    private int sequence = 0;

    public void salvar(T t){
        if (Objects.nonNull(t)){
            lista.add(t);
        }else{
            System.out.println("Item está vazio");
        }

    }
    public void alterar(T oldObj, T newObj){
        int index = lista.indexOf(oldObj);
        lista.set(index, newObj);
    }
    public void imprimir(){
        for (T t: lista) {
            System.out.printf("%d - ", sequence);
            System.out.println(t);
            sequence++;
        }
        sequence = 0;
    }
    public T buscar(int i){
        return lista.get(i);
    }

    public void deletar(T t){
        lista.remove(t);
    }
}


