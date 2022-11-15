package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;

public class Registro {

    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    Scanner sc = new Scanner(System.in);
    private String[] cardapio;
    static LinkedList<String[]> cardapios = new LinkedList<String[]>();
   
    public static Pessoa CadastroCozinheiro() {
        System.out.println("Digite seu nome de usuário: ");
         nome = sc.nextLine(); 
         perfil.setNome(nome);
         System.out.println("Digite uma senha numérica: ");
         senha = sc.nextInt();
         perfil.setSenha(senha);
         user = "Cozinheiro";
         perfil.setUser(user);
         //Cardapio();
         System.out.println("Quantos pratos terá em seu cardápio? ");
         int quantidadeDeCardapios = sc.nextInt();
       
         setCardapio(this.cardapio, quantidadeDeCardapios);
         System.out.println("Digite seus pratos: ");
         this.cardapio[0] = sc.nextLine();
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             // System.out.println("coloque um pratinho");
              System.out.println((i+1)+ ": ");
              this.cardapio[i] = sc.nextLine();
          }
         cardapios.addLast(this.cardapio);
         System.out.println(perfil.toString());
 
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             System.out.println("Prato "+(i+1)+ ": " + cardapio[i]);
         }
 
         return perfil;
     }

     private void setCardapio(String[] cardapio2, int quantidadeDeCardapios) {
    }

    public static Pessoa CadastroCliente() {
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite uma senha numérica: ");
        senha = sc.nextInt(); sc.nextLine();
        perfil.setSenha(senha);
        user = "Cliente";
        perfil.setUser(user);
        return perfil; //vai adicionar na lista! onde isso acontece?
    }

 

   




    
}
