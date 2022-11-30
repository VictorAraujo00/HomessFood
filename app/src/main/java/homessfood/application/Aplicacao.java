package homessfood.application;

//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.LinkedList;
import java.util.Scanner;

import homessfood.Facade.Facade;
import homessfood.data.RepositorioPessoas;
import homessfood.entities.Cliente;
import homessfood.entities.Cozinheiros;
import homessfood.entities.Login;
import homessfood.entities.Pessoa;
import homessfood.entities.Registro;
import homessfood.exceptions.ExcecaoLogin;

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
        LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();
        LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();
        Scanner sc = new Scanner(System.in);
        int op=0;
        //incialização do objeto Pessoa para chamar métodos das classes cozinheiros e cliente
        String nome="", user="";
        int senha=0;
        String[] cardapio = {};
        //chamando objetos das classes
        Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha, cardapio);
        Cliente cliente = new Cliente(nome, user, senha);
        Registro registro = new Registro(nome, user, senha, cardapio);
        Login login = new Login(nome, user, senha);
        //criação de listas

        do {
            opcoes();
            op = sc.nextInt();
            if (op == 1) {
            //   Pessoa cozinheiroLogin = login.EntrarCozinheiro();
             /*  try{
                    if(listaCozinheiros.contains(cozinheiroLogin)==false){
                          throw new ExcecaoLogin();
                      }
                      else if(listaCozinheiros.contains(cozinheiroLogin)==true){
                          System.out.println("Login efetuado com sucesso!");
                           //achar posição do cozinheiro
                        int pos = posNaLista(cozinheiroLogin, listaCozinheiros); //para que o cardapio corresponda ao cozinheiro, devemos salvar sua pos na lista
                        cozinheiros.exibirTelaCozinheiro(pos);
                       }
                   }catch(ExcecaoLogin e){
                      System.out.println("Usuário não corresponde /  Senha incorreta"); 
                  } */
                  fachadaApp.loginCozinheiros();
              }
              else if (op== 2) {
                //   Pessoa novoCozinheiro = registro.CadastroCozinheiro();
                  /*if(listaCozinheiros.contains(novoCozinheiro)){
                      System.out.println("Usuário já cadastrado!");
                  }
                  else{
                      listaCozinheiros.addLast(novoCozinheiro);
                      System.out.println("Cadastro feito com sucesso!");
                  }*/
                  fachadaApp.cadastroCozinheiros();
              }
              else if (op == 3) {
                  //Pessoa clienteLogin = login.EntrarCliente();
                  
                //   if(listaClientes.contains(clienteLogin)==false){
                //     throw new ExcecaoLogin();
                //   }
                //     else if(listaClientes.contains(clienteLogin)==true){
                //         System.out.println("Login efetuado com sucesso!");
                //         System.out.println(" ");
                //         cliente.opcoesTelaClientes(listaCozinheiros);
                //     }
                fachadaApp.loginClientes();
               
              }
              else if (op== 4) {
                //   Pessoa novoCliente = registro.CadastroCliente();             
                //   if(listaClientes.contains(novoCliente)){
                //       System.out.println("Usuário já cadastrado!");
                //   }
                //   else{
                //       listaClientes.addLast(novoCliente);
                //       System.out.println("Cadastro feito com sucesso!");
                //   }
                fachadaApp.cadastroClientes();
              }
              else if (op == 5){
                  System.out.println("Você ficou offline");
                  return; 
              }
          } while (op !=5);
    }
    }


  




