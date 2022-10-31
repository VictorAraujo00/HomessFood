package homessfood;

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
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cliente";
        perfil.setUser(user);
        return perfil; //vai adicionar na lista! onde isso acontece?
    }

    public Pessoa EntrarCliente() {
       // menu();
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();
        nomeInserido = sc.nextLine();
        //nomeInserido = sc.nextLine();

        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();
        user = "Cliente";

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);
        return login;
    }

    public void exibirTelaCliente(){
        //aqui ficarão os ifs pra cada opção escolhida de cozinheiro 
    }

}
 