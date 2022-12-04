package homessfood.negocio.entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import homessfood.negocio.interfaces.ITCliente;
public class Cliente extends Pessoa implements ITCliente{  

    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
       this.pedido = pedido;
    }

    FazerPedido pedido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha, null);
    //ArrayList<String[]> cardapios = Registro.getCardapios();
    //Registro registro = new Registro(nome, user, senha, null);
    
    public void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros, ArrayList<String[]> cardapios){
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
            return;
        }
        exibirTelaCliente(size, cardapios);
    }

    public void exibirTelaCliente(int size, ArrayList<String[]> cardapios){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        int op = sc.nextInt();
        int index=0;
        int sizeCardapios = cardapios.size();
      
        if(sizeCardapios>=1){
            for (index = 0; index < size; index++) {
                if (op == index+1) {
                    cozinheiros.Cardapios(cardapios.get(index));
                }
                else if (op >= size) {
                    return;
                }
            }
        }
        else{
            System.out.println("Não temos cardápios disponíveis no momento.");
            return;
        }
           

    }

}
 