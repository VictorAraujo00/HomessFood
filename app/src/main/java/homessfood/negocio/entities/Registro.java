package homessfood.negocio.entities;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

import homessfood.negocio.interfaces.ICadastro;

public class Registro extends Pessoa implements ICadastro{

    Scanner sc = new Scanner(System.in);
    private String[] cardapio;
    ArrayList<String[]> cardapios = new ArrayList<String[]>();

    public Registro(String nome, String user, int senha, String[] cardapio, ArrayList<String[]> cardapios) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        this.cardapios = cardapios;
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
         return perfil;
     }

     public ArrayList<String[]> criarCardapio(Pessoa perfil) {
        System.out.println("Quantos pratos terá em seu cardápio? ");
        int quantidadeDeCardapios = sc.nextInt();
        System.out.println("Digite seus pratos: ");
        this.cardapio[0] = sc.nextLine();
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            // System.out.println("coloque um pratinho");
             System.out.println((i+1)+ ": ");
             this.cardapio[i] = sc.nextLine();
         }
        //getCardapios().add(this.cardapio);
        setCardapios(getCardapios(), this.cardapio);
        System.out.println(perfil.toString());
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            System.out.println("Prato "+(i+1)+ ": " + cardapio[i]);
        }
        setCardapio(cardapio, quantidadeDeCardapios);
        return getCardapios();
     }

     public ArrayList<String[]> getCardapios() {
         return this.cardapios;
     }

     public void setCardapios(ArrayList<String[]> cardapios, String[] cardapioo) {
         //this.cardapios = cardapios;
         cardapios.add(cardapioo);
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
