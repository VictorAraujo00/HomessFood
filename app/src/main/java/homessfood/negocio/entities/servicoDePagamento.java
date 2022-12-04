package homessfood.negocio.entities;

import homessfood.negocio.interfaces.PagamentoStrategy;

public class servicoDePagamento {
    private int custo;
    private boolean incluirDelivery;
    private PagamentoStrategy strategy;

    public void processamentoDoPedido() {
        strategy.dadosDoPagamento();
            if(strategy.validacao()){
                strategy.pagamentos(getTotal());
            }
    }
    private int getTotal(){
        return incluirDelivery ? custo + 20 : custo;
    }
}
