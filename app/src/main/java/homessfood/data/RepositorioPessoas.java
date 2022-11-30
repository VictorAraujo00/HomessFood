package homessfood.data;

import java.util.LinkedList;
import java.util.Scanner;

import homessfood.entities.Cliente;
import homessfood.entities.Cozinheiros;
import homessfood.entities.Login;
import homessfood.entities.Pessoa;
import homessfood.entities.Registro;
import homessfood.exceptions.ExcecaoLogin;

public class RepositorioPessoas implements IRepository  {

    LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();
    LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();

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

    public RepositorioPessoas() {
        this.listaClientes = new LinkedList<>();
    }

    // Login login;
    // Cliente cliente;
    // Registro registro;
    // Cozinheiros cozinheiros;

    public static int posNaLista(Pessoa cozinheiroLogin, LinkedList<Pessoa> lista) {
        int pos=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == cozinheiroLogin) {
                pos = i;
            }
        }
        return pos;
    }


    public void loginClientes() throws ExcecaoLogin{
        Pessoa clienteLogin = login.EntrarCliente();
            if(listaClientes.contains(clienteLogin)==false){
                    throw new ExcecaoLogin();
                }
                    else if(listaClientes.contains(clienteLogin)==true){
                        System.out.println("Login efetuado com sucesso!");
                        System.out.println(" ");
                        cliente.opcoesTelaClientes(listaCozinheiros);
                    }
    }

    public void cadastroClientes(){
        Pessoa novoCliente = registro.CadastroCliente();             
          if(listaClientes.contains(novoCliente)){
                      System.out.println("Usuário já cadastrado!");
                  }
                  else{
                      listaClientes.addLast(novoCliente);
                      System.out.println("Cadastro feito com sucesso!");
                  }
          }

          public void loginCozinheiros(){
            Pessoa cozinheiroLogin = login.EntrarCozinheiro();
            try{
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
                      }
            }
            public void cadastroCozinheiros(){
                Pessoa novoCozinheiro = registro.CadastroCozinheiro();
                    if(listaCozinheiros.contains(novoCozinheiro)){
                            System.out.println("Usuário já cadastrado!");
                        }
                        else{
                            listaCozinheiros.addLast(novoCozinheiro);
                            System.out.println("Cadastro feito com sucesso!");
                        }
            }
}
