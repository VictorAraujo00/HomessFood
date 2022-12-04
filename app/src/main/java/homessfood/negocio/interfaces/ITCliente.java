package homessfood.negocio.interfaces;
import java.util.ArrayList;
import java.util.LinkedList;

import homessfood.negocio.entities.Pessoa;

public interface ITCliente {
    void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros, ArrayList<String[]> cardapios);
    void exibirTelaCliente(int size, ArrayList<String[]> cardapios);
}
