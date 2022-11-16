package homessfood.interfaces;
import java.util.LinkedList;

import homessfood.entities.Pessoa;

public interface ITCliente {
    Pessoa CadastroCliente();
    Pessoa EntrarCliente();
    void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros);
    void exibirTelaCliente(int a);
}
