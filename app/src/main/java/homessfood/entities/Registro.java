package homessfood.entities;

import java.util.LinkedList;

public class Registro {
    private LinkedList<Pessoa> lista;


    public Registro(LinkedList<Pessoa> lista) {
        this.lista = new LinkedList<>();
    }

    public void inserirLista(Pessoa inserida){
        this.lista.addLast(inserida);
    }

   




    
}
