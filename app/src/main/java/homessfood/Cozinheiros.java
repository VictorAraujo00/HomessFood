package homessfood;

import java.util.Scanner;

public class Cozinheiros extends Pessoa{
    
    Scanner sc = new Scanner(System.in);

    private FazerPedido pedido;
    private String[] cardapio;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;
    private int indescolhido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);

    
    public Cozinheiros(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        this.avaliacao=avaliacao;
        this.pedido = new FazerPedido();
        this.indescolhido = indescolhido;
    }

    public Pessoa CadastroCozinheiro() {
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine(); sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite uma senha numérica: ");
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cozinheiro";
        perfil.setUser(user);
        //Cardapio();
        System.out.println("Quantos pratos terá em seu cardápio? ");
        int quantidadeDeCardapios = sc.nextInt();
        //setQuantidadeDeCardapios(quantidadeDeCardapios);
        setCardapio(cardapio, quantidadeDeCardapios);
        System.out.println("Digite seus pratos: ");
        cardapio[0] = sc.nextLine();
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            // System.out.println("coloque um pratinho");
             System.out.println((i+1)+ ": ");
             cardapio[i] = sc.nextLine();
         }
        System.out.println(perfil.toString());

        for (int i = 0; i < quantidadeDeCardapios; i++) {
            System.out.println("Prato "+(i+1)+ ": " + cardapio[i]);
        }

        return perfil;
    }

    public Pessoa EntrarCozinheiro() {
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();
        //nomeInserido = sc.nextLine();

        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();
        user = "Cozinheiro";

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);

        return login;
    }

    public void opcoesTelaCozinheiros(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Visualizar quantos pedidos foram realizados");
        //System.out.println("2- ");
        System.out.println("2- Visualizar qual o valor total ganho com a venda dos pratos");
        System.out.println("3- sair");
    }

    public void exibirTelaCozinheiro(){
        String nome="", user="";
        int senha=0;
        opcoesTelaCozinheiros();
        System.out.println("==========================");
        int op = sc.nextInt();

        //aqui ficará um do while mostrando as opções a serem escolhidas (while != 3)
       
    }

    //essa tela será exibida para o cliente após escolher o cozinheiro
    public void Cardapios(String[] cardapio) {
        System.out.println(" ======= Cardápio ======= ");
        for (int i = 0; i < cardapio.length; i++) {
             System.out.println(cardapio[i]);

        }
        System.out.println("ESCOLHA O SEU PEDIDO: ");
        indescolhido = sc.nextInt(); //nullpointer
        String comida = pedido.EscolhadoItemCardapio(cardapio, indescolhido);
        System.out.println("Você escolheu " + comida);
        pedido.Avaliacao();
    }

    public void exibirPedidosFeitos(){
            System.out.println(getItemEscolhidoDoCardapio());
    }

    //abaixo só um monte de getters e setters

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
