package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;
public class Cliente extends Pessoa{  

    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
       this.pedido = pedido;
    }

    FazerPedido pedido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    
    public static void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros){
        System.out.println("========= Escolha um cozinheiro ========");
        System.out.println();
        int i=0;
        int size = listaCozinheiros.size();
        if(size>=1){
        for(i = 0; i < size; i++){
            System.out.println(i+1 + ". " + listaCozinheiros.get(i));
        }
       }
        else{
         System.out.println("Não temos cozinheiros disponíveis no momento.");
        }
        int quant = listaCozinheiros.size();
        exibirTelaCliente(quant);
    }

    public static void exibirTelaCliente(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        int op = sc.nextInt();

            for (int index = 0; index < size; index++) {
                if (op == index+1) {
                    Cozinheiros.Cardapios(Cozinheiros.cardapios.get(index));
                }
                else if (op >= size) {
                    return;
                }
            }

    }

}
 