package homessfood.negocio.interfaces;

public interface PagamentoStrategy {
    void dadosDoPagamento();
    //para a validação dos dados colocados
    boolean validacao();
    //quantia
    void pagamentos(float quantia);
    
}
