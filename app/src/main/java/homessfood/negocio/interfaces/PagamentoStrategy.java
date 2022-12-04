package homessfood.negocio.interfaces;

public interface PagamentoStrategy {
    void CZ();
    //para a validação dos dados colocados
    boolean validacao();
    //quantia
    void pagamentos(int amount);
    
}
