package homessfood.application;

//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.LinkedList;
import java.util.Scanner;

import homessfood.data.RepositorioPessoas;
import homessfood.data.exceptions.ExcecaoLogin;
import homessfood.negocio.Facade.Facade;
import homessfood.negocio.entities.Cliente;
import homessfood.negocio.entities.Cozinheiros;
import homessfood.negocio.entities.Login;
import homessfood.negocio.entities.Pessoa;
import homessfood.negocio.entities.Registro;

public class Aplicacao {

    Scanner sc = new Scanner(System.in);
    public static void opcoes(){
        System.out.println("");
        System.out.println("");
        System.out.println("\u001b[34m \u001b[34m======= HOME'S FOOD =======\u001b[m");
        System.out.println("");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Entrar como cozinheiro");
        System.out.println("2. Cadastrar como cozinheiro");
        System.out.println("3. Entrar como cliente");
        System.out.println("4. Cadastrar como cliente");
        System.out.println("5. Sair");
    }

    public static int posNaLista(Pessoa cozinheiroLogin, LinkedList lista) {
        int pos=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == cozinheiroLogin) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args) throws Exception {
        RepositorioPessoas novoRepositorio = new RepositorioPessoas();
        Facade fachadaApp = new Facade();
        //LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();
        //LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();
        Scanner sc = new Scanner(System.in);
        int op=0;
        //incialização do objeto Pessoa para chamar métodos das classes cozinheiros e cliente
        String nome="", user="";
        int senha=0;
        String[] cardapio = {};
        //chamando objetos das classes
        //Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha, cardapio);
        //qCliente cliente = new Cliente(nome, user, senha);
        //Registro registro = new Registro(nome, user, senha, cardapio);
        //Login login = new Login(nome, user, senha);
        //criação de listas

        do {
            opcoes();
            op = sc.nextInt();
            if (op == 1) {
                  fachadaApp.loginCozinheiros();
              }
              else if (op== 2) {
                  fachadaApp.cadastroCozinheiros();
              }
              else if (op == 3) {
                fachadaApp.loginClientes();
              }
              else if (op== 4) {
              
                fachadaApp.cadastroClientes();
              }
              else if (op == 5){
                  System.out.println("Você ficou offline");
                  return; 
              }
          } while (op !=5);
    }
    }


  




