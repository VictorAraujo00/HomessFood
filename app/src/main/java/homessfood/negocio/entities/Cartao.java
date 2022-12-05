package homessfood.negocio.entities;
// objeto cartão
public class Cartao {

    private int numeroDoCartao;
    private int dataExpiracao;
    private int cvv;
    private float quantia;

    public Cartao(String string,String string2, String string3) {
        this.numeroDoCartao = string;
        this.dataExpiracao = string2;
        this.cvv = string3;
        this.quantia = quantia;
    }

    public int getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(int numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public int getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(int dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public float getQuantia() {
        return 0;
    }

    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }

}
