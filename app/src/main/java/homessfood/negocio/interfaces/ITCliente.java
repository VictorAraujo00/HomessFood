package homessfood.negocio.interfaces;
import java.util.LinkedList;

import homessfood.negocio.entities.Pessoa;

public interface ITCliente {
    void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros);
    void exibirTelaCliente(int a);
}
