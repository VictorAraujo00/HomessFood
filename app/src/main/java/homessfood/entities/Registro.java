package homessfood.entities;

import java.util.LinkedList;
import java.util.Scanner;

import homessfood.interfaces.ICadastro;

public class Registro extends Pessoa implements ICadastro{

    static String nome="";
    static String user="";
    static int senha=0;
    static Pessoa perfil = new Pessoa(nome, user, senha);
    Scanner sc = new Scanner(System.in);
    static String[] cardapio;
    static LinkedList<String[]> cardapios = new LinkedList<String[]>();

    public Registro(String nome, String user, int senha, String[] cardapio) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        //this.avaliacao=avaliacao;
        
    }
   
    public Pessoa CadastroCozinheiros() {
        Scanner sc = new Scanner(System.in);
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
       
         setCardapio(cardapio, quantidadeDeCardapios);
         System.out.println("Digite seus pratos: ");
         cardapio[0] = sc.nextLine();
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             // System.out.println("coloque um pratinho");
              System.out.println((i+1)+ ": ");
              cardapio[i] = sc.nextLine();
          }
         cardapios.addLast(cardapio);
         System.out.println(perfil.toString());
 
         for (int i = 0; i < quantidadeDeCardapios; i++) {
             System.out.println("Prato "+(i+1)+ ": " + cardapio[i]);
         }
 
         return perfil;
     }

     public static void setCardapio(String[] cardapio, int quantidadeDeCardapios) {
        //this.cardapio = cardapio;
        cardapio= new String [quantidadeDeCardapios];
    }

    public String[] getCardapio() {
        return this.cardapio;
    }
    
    public static Pessoa CadastroCliente() {
        Scanner sc = new Scanner(System.in);
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
