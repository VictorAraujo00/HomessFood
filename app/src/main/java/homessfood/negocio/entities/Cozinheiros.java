package homessfood.negocio.entities;

import java.util.ArrayList;
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
    FazerPedido fazerpedido = new FazerPedido();
    
    public Cozinheiros(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        ArrayList<String> pedidosFeitos = new ArrayList<>();
        //pedidosFeitos.add(pedido);
        this.pedido = new FazerPedido();
    }
    

    public void opcoesTelaCozinheiros(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- Visualizar quantos pedidos foram realizados");
        System.out.println("2- Voltar");
    }

    public void exibirTelaCozinheiro(int pos){
        opcoesTelaCozinheiros();
        System.out.println(" ========================== ");
        int op = sc.nextInt();

        if (op == 1) {
            ArrayList<String> pedidosRecebidos= encontrarPedidos(pos);
            fazerpedido.receberPedidos(pedidosRecebidos);
            return;
        }
        else if (op == 2){
            return; 
        } 
    }

    public ArrayList<String> encontrarPedidos (int pos) {
        ArrayList<String> pedidosRecebidos = new ArrayList<>();
        System.out.println(registro.getCardapios().size());
        if (registro.getCardapios().size() <= 0 ) {
            System.out.println("Nenhum pedido foi feito até agora");
        }
        else {
            String[] cardapioDesseCozinheiro = registro.getCardapios().get(pos); //NESSA LINHA
            int index;
                for (index = 0; index < cardapioDesseCozinheiro.length; index++) {
                    if (fazerpedido.pedidosFeitos.contains(cardapioDesseCozinheiro[index])) {
                        pedidosRecebidos.add(cardapioDesseCozinheiro[index]);
                    }
                } 
                if(pedidosRecebidos.size()==0){
                    System.out.println("Não possui nenhum pedido no momento");
                }
        }
        return pedidosRecebidos;
    }

    //essa tela será exibida para o cliente após escolher o cozinheiro
    //Cozinheiros.Cardapios(Cozinheiros.cardapios.get(index));
    public void Cardapios(String[] cardapio) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ======= Cardápio ======= ");
        for (int i = 0; i < cardapio.length; i++) {
             System.out.println((i+1) + ". " + cardapio[i]);

        }
        System.out.println(" ");
        System.out.println("ESCOLHA O SEU PEDIDO: ");
        indescolhido = sc.nextInt(); 
        String comida = pedido.EscolhidoItemCardapio(cardapio, indescolhido);
        System.out.println("Você escolheu " + comida);
        fazerpedido.pedidosFeitos.add(comida);
        //obs: por enquanto os pedidos aparecem pra todos os cozinheiros; 
        //pode colocar uma condição de se cardapio contain comida, vai aparecer, caso contrário é mensagem de que n recebeu pedidos
        pedido.Avaliacao(); 
    }

    public void exibirPedidosFeitos(){
            System.out.println(getItemEscolhidoDoCardapio());
    }
    
    public String getItemEscolhidoDoCardapio(){
       String itemEscolhido= pedido.EscolhidoItemCardapio(cardapio, indescolhido);
        return itemEscolhido; 
    }


}
