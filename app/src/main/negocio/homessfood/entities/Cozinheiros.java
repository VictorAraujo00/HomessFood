package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;


public class Cozinheiros extends Pessoa {
    
    Scanner sc = new Scanner(System.in);

    private static FazerPedido pedido;
    private String[] cardapio;
    private static int indescolhido;
    //static LinkedList<String[]> cardapios = new LinkedList<String[]>();
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    Registro registro = new Registro(nome, user, senha, cardapio);
    
    public Cozinheiros(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        this.pedido = new FazerPedido();
    }
    

    public void opcoesTelaCozinheiros(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Visualizar quantos pedidos foram realizados");
        System.out.println("2- Voltar");
    }

    public LinkedList<String> encontrarPedidos (int pos) {
        LinkedList<String> pedidosRecebidos = new LinkedList<String>();
        String[] cardapioDesseCozinheiro = registro.getCardapios().get(pos);
        int index;
            for (index = 0; index < cardapioDesseCozinheiro.length; index++) {
                if (FazerPedido.pedidosFeitos.contains(cardapioDesseCozinheiro[index])) {
                    pedidosRecebidos.addLast(cardapioDesseCozinheiro[index]);
                }
            } 
            if(pedidosRecebidos.size()==0){
                System.out.println("Não possui nenhum pedido no momento");
            }
        return pedidosRecebidos;
    }
     

    public void exibirTelaCozinheiro(int pos){
        opcoesTelaCozinheiros();
        System.out.println(" ========================== ");
        int op = sc.nextInt();

        if (op == 1) {
            LinkedList<String> pedidosRecebidos= encontrarPedidos(pos);
            FazerPedido.receberPedidos(pedidosRecebidos);
            return;
        }
        else if (op == 2){
            return; 
        } 
    }

    //essa tela será exibida para o cliente após escolher o cozinheiro
    //Cozinheiros.Cardapios(Cozinheiros.cardapios.get(index));
    public static void Cardapios(String[] cardapio) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ======= Cardápio ======= ");
        for (int i = 0; i < cardapio.length; i++) {
             System.out.println((i+1) + ". " + cardapio[i]);

        }
        System.out.println(" ");
        System.out.println("ESCOLHA O SEU PEDIDO: ");
        indescolhido = sc.nextInt(); 
        String comida = pedido.EscolhadoItemCardapio(cardapio, indescolhido);
        System.out.println("Você escolheu " + comida);
        FazerPedido.pedidosFeitos.addLast(comida);
        //obs: por enquanto os pedidos aparecem pra todos os cozinheiros; 
        //pode colocar uma condição de se cardapio contain comida, vai aparecer, caso contrário é mensagem de que n recebeu pedidos
        pedido.Avaliacao(); 
    }

    public void exibirPedidosFeitos(){
            System.out.println(getItemEscolhidoDoCardapio());
    }

    
    public String getItemEscolhidoDoCardapio(){
       String itemEscolhido= pedido.EscolhadoItemCardapio(cardapio, indescolhido);
        return itemEscolhido; 
    }


}
