package homessfood.negocio.entities;

public class AvaliacaoCozinheiro extends Cozinheiros{

    public AvaliacaoCozinheiro(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha, cardapio);
    }
    private String[] cardapio;
    private FazerPedido pedido;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;
    private int indescolhido;

    public float getAvaliacao() {
        return avaliacao;
    }
    public String[] getCardapio() {
        return this.cardapio;
    }

    public float getMediaAvaliacao() {
        return mediaAvaliacao;
    }
 
    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }
    
    public String getItemEscolhidoDoCardapio(){
       String itemEscolhido= pedido.EscolhadoItemCardapio(cardapio, indescolhido);
        return itemEscolhido; 
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setCardapio(String[] cardapio, int quantidadeDeCardapios) {
        //this.cardapio = cardapio;
        this.cardapio= new String [quantidadeDeCardapios];
    }

    public void setMediaAvaliacao(float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }
    public float avaliacao(float avaliacao){
        this.avaliacao = avaliacao;
        this.quantidadeDeAvaliacoes++;
        return this.avaliacao;
    }

    public float media(){
        this.mediaAvaliacao = this.avaliacao/this.quantidadeDeAvaliacoes;
        return this.mediaAvaliacao;
    }

}
