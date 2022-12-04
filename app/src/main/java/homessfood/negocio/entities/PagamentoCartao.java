package homessfood.negocio.entities;

import homessfood.negocio.interfaces.PagamentoStrategy;

public class PagamentoCartao implements PagamentoStrategy {

    private Cartao cartao;
    
    public void dadosDoPagamento(){
        cartao = new Cartao("numero do cartao", "dataExpiracao","cvv");
    }
    public boolean validacao(){
        //validar o catao de crédito
        return false;
    }
    public void pagamentos(float quantia){
        System.out.println("pagamento de"+ quantia + "udsando o seu cartão de crédito");
        //cartao.setQuantia(cartao.getQuantia() - quantia);
    }

}
