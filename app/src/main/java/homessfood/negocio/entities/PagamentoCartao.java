package homessfood.negocio.entities;

import java.sql.Date;

import homessfood.negocio.interfaces.PagamentoStrategy;

public class PagamentoCartao implements PagamentoStrategy {

    private Cartao cartao;
    
    public void dadosDoPagamento(){
        cartao = new Cartao("numero do cartao", "dataExpiracao","cvv");
    }
    public boolean validacao(){
        //se tiver uma sequencia de números maior do que isso retorna false
       if(cartao.getNumeroDoCartao()>16){
            return false;
       }
       if(cartao.getCvv()>3){
            return false;
       }
        return true;
    }
    public void pagamentos(float quantia){
        System.out.println("Pagamento de"+ quantia + "usando o seu cartão de crédito");
        cartao.setQuantia(cartao.getQuantia() - quantia);
    }

}
