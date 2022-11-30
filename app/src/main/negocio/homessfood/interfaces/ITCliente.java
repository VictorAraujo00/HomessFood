package homessfood.interfaces;
import java.util.LinkedList;

import homessfood.entities.Pessoa;

public interface ITCliente {
    void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros);
    void exibirTelaCliente(int a);
}
