package homessfood.negocio.entities;
// objeto cartão
public class Cartao {

    private String numeroDoCartao;
    private String dataExpiracao;
    private String cvv;

    public Cartao(String numeroDoCartao, String dataExpiracao, String cvv) {
        this.numeroDoCartao = numeroDoCartao;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
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

}
