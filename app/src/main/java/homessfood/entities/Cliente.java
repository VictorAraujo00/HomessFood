package homessfood.entities;

import java.util.Scanner;
public class Cliente extends Pessoa{  

    Scanner sc = new Scanner(System.in);
    FazerPedido pedido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    private Cozinheiros cozinheiros;
    
    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
       this.pedido = pedido;
    }

    public Pessoa CadastroCliente() {
        //em vez de super usar perfil
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

    public Pessoa EntrarCliente() {
       // menu();
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();
        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();sc.nextLine();
        user = "Cliente"; 

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);
        return login;
    }

    public void opcoesTelaClientes(){
        System.out.println("Escolha uma opção:");
        System.out.println("1- faça um pedido");
        System.out.println("2-sair");
    }
    public void exibirTelaCliente(){
        String nome="", user="";
        int senha=0;
        opcoesTelaClientes();
        System.out.println("==========================");
        int op = sc.nextInt();
        //aqui ficarão os ifs pra cada opção escolhida de cozinheiro 
    }

}
 