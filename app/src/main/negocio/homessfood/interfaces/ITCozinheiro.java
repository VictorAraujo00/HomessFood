package homessfood.interfaces;

import java.util.LinkedList;

public interface ITCozinheiro {
    void opcoesTelaCozinheiros();
    LinkedList<String> encontrarPedidos (int pos);
    void exibirTelaCozinheiro(int pos);
    void Cardapios(String[] cardapio);
    void exibirPedidosFeitos();
    String getItemEscolhidoDoCardapio();
}
