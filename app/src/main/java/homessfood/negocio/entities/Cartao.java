package homessfood.negocio.entities;
// objeto cartão
public class Cartao {

    private String numeroDoCartao;
    private String dataExpiracao;
    private int cvv;

    public Cartao(String numeroDoCartao, String dataExpiracao, int cvv) {
        this.numeroDoCartao = numeroDoCartao;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
    }

}
