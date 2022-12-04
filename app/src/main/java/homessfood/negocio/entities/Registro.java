package homessfood.negocio.entities;

import java.util.LinkedList;
import java.util.Scanner;

import homessfood.negocio.interfaces.ICadastro;

public class Registro extends Pessoa implements ICadastro{

    Scanner sc = new Scanner(System.in);
    private String[] cardapio;
    LinkedList<String[]> cardapios = new LinkedList<String[]>();

    public Registro(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        //this.avaliacao=avaliacao;
    }
   
    public Pessoa CadastroCozinheiro() {
        
        System.out.println("Digite seu nome de usuário: ");
         String nome = sc.nextLine(); 
         //perfil.setNome(nome);
         System.out.println("Digite uma senha numérica: ");
         int senha = sc.nextInt();
         //perfil.setSenha(senha);
         String user = "Cozinheiro";
         //perfil.setUser(user);
         Pessoa perfil = new Pessoa(nome, user, senha);
         //Cardapio();
         System.out.println("Quantos pratos terá em seu cardápio? ");
         int quantidadeDeCardapios = sc.nextInt();
       
         setCardapio(cardapio, quantidadeDeCardapios);
         System.out.println("Digite seus pratos: ");
         this.cardapio[0] = sc.nextLine();
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             // System.out.println("coloque um pratinho");
              System.out.println((i+1)+ ": ");
              this.cardapio[i] = sc.nextLine();
          }
         getCardapios().addLast(this.cardapio);
         System.out.println(perfil.toString());
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             System.out.println("Prato "+(i+1)+ ": " + cardapio[i]);
         }
         return perfil;
     }

     public LinkedList<String[]> getCardapios() {
         return this.cardapios;
     }

     public void setCardapios(LinkedList<String[]> cardapios) {
         this.cardapios = cardapios;
     }

     public static void setCardapio(String[] cardapio, int quantidadeDeCardapios) {
        //this.cardapio = cardapio;
        cardapio = new String [quantidadeDeCardapios];
    }

    public String[] getCardapio() {
        return this.cardapio;
    }

    public Pessoa CadastroCliente() {
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
       
        System.out.println("Digite uma senha numérica: ");
        int senha = sc.nextInt(); sc.nextLine();
       
        String user = "Cliente";
        
        Pessoa perfil = new Pessoa(nome, user, senha);
        return perfil; //vai adicionar na lista! onde isso acontece?
    }

 

   




    
}
