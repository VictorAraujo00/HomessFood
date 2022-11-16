package homessfood.interfaces;

import homessfood.entities.Pessoa;

public interface ITCliente {
    Pessoa CadastroCliente();
    Pessoa EntrarCliente();
    void opcoesTelaClientes();
    void exibirTelaCliente();
}
