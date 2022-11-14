package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;

public class FazerPedido {
    Scanner sc = new Scanner(System.in);
    private int quantPedidos, somaAvaliacao=0, quantAvaliacoes=0; 
    //private String[] pedidos; //o tamanho será a quantia de pedidos
    private int avaliacao; 
    private float mediaAvaliacao;//fazer calculo de média, só vai adiconar, não aparece a avaliação individual; e será feita após o pedido (perguntando se foi recebido)
    private String pedido;
    static LinkedList<String> pedidosFeitos = new LinkedList<String>();

    public FazerPedido(){
        this.quantPedidos=quantPedidos;
        //this.pedidos = new String[quantPedidos];
        this.avaliacao=avaliacao;
        this.mediaAvaliacao=mediaAvaliacao;
        this.pedido=pedido;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    //public void setPedidos(String[] pedidos) {
    //    this.pedidos = pedidos;
    //}
    public void setQuantPedidos(int quantPedidos) {
        this.quantPedidos = quantPedidos;
    }
    
    public String[] selecionarPedidos() {
        //mostraPedidos()
        return null;
    }

    public int getQuantPedidos(){
        return this.quantPedidos;
    }

    //public String getPedidos(int cont){
     //   return this.pedidos[cont];
    //}

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public float getMediaAvaliacao(){
        return this.mediaAvaliacao;
    }

    public String EscolhadoItemCardapio(String[] cardapio, int indescolhido){
        int i;
        for(i=0; i< cardapio.length;i++){
            if(indescolhido==i+1){
                 pedido = cardapio[i];
            }
        }
        return pedido;
        //obs-> só pode quando pedido for feito antes (?)
    }

    public static void receberPedidos(LinkedList<String> pedidosRecebidos){
        System.out.println(" ==================== ");
        System.out.println("PEDIDOS: ");
        if (pedidosRecebidos.isEmpty()) {
            System.out.println("Você ainda não recebeu nenhum pedido ");
            return;
        } else {
            System.out.println(pedidosRecebidos.toString());
        }
        
    }

    public void setMediaAvaliacao(int estrelas) {
        this.somaAvaliacao = somaAvaliacao + estrelas;
        this.mediaAvaliacao = (somaAvaliacao)/quantAvaliacoes;
        //aparecer para o cliente e cozinheiro (mas aí só a respeito da comida dele)
    }

    public void Avaliacao() {
        System.out.println("O pedido está a caminho...");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . .");
        System.out.println("\u001b[37m \u001b[44m Seu pedido foi entregue! \u001b[m");
        System.out.println("De 0 a 5 estrelas, como você avalia o nosso cozinheiro? ");
        int estrelas = sc.nextInt();
        this.quantAvaliacoes++;
        setAvaliacao(estrelas);
        setMediaAvaliacao(estrelas);
        System.out.println("\u001b[1m Obrigada por dar "+estrelas+" estrelas! \u001b[m");
        System.out.println("\u001b[1m ============================== \u001b[m ");

        //voltar a tela inicial
    }

}
