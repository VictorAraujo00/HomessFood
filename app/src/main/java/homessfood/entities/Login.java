package homessfood.entities;

import java.util.Scanner;

public class Login extends Pessoa {
    private String nome="";
    private String user="";
    private int senha=0;
    private Pessoa perfil = new Pessoa(nome, user, senha);
  

    public Login(String nome, String user, int senha) {
        super(nome, user, senha);
    }

    public Pessoa EntrarCozinheiro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();
        //nomeInserido = sc.nextLine();

        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();
        sc.nextLine();
        user = "Cozinheiro";

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);
        return login;
    }

    public Pessoa EntrarCliente() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();

        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();sc.nextLine();
        user = "Cliente"; 

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);
        return login;
    }
}
