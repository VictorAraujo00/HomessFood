package homessfood.negocio.entities;

import homessfood.negocio.interfaces.PagamentoStrategy;

public class PagamentoCartao implements PagamentoStrategy {

    private Cartao cartao;
    
    public void dadosDoPagamento(){
        cartao = new Cartao("numero do cartao", "dataExpiracao","cvv");
    }
    public boolean validacao(){
        return false;
    }
    public void pagamentos(int amount){

    }
    @Override
    public void dadosDoPagamentoZ() {
        // TODO Auto-generated method stub
        
    }

}
