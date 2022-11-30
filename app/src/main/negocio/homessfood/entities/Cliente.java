package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;

import homessfood.interfaces.ITCliente;
public class Cliente extends Pessoa implements ITCliente{  

    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
       this.pedido = pedido;
    }

    FazerPedido pedido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    Registro registro = new Registro(nome, user, senha, null);
    
    public void opcoesTelaClientes(LinkedList<Pessoa> listaCozinheiros){
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
        exibirTelaCliente(size);
    }

    public void exibirTelaCliente(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        int op = sc.nextInt();
        int index=0;
        System.out.println(registro.getCardapios().size());

            for (index = 0; index < size; index++) {
                if (op == index+1) {
                    Cozinheiros.Cardapios(registro.getCardapios().get(index));
                }
                else if (op >= size) {
                    return;
                }
            }

    }

}
 