package homessfood.negocio.entities;
// objeto cartão
public class Cartao {

    private String numeroDoCartao;
    private String dataExpiracao;
    private String cvv;
    private float quantia;

    public Cartao(String numeroDoCartao, String dataExpiracao, String cvv) {
        this.numeroDoCartao = numeroDoCartao;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
        this.quantia = quantia;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public float getQuantia() {
        return 0;
    }

    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }

}
