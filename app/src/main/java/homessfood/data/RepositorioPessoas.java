package homessfood.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import homessfood.data.exceptions.ExcecaoLogin;
import homessfood.negocio.entities.Cliente;
import homessfood.negocio.entities.Cozinheiros;
import homessfood.negocio.entities.Login;
import homessfood.negocio.entities.Pessoa;
import homessfood.negocio.entities.Registro;

public class RepositorioPessoas implements IRepository  {

    LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();
    LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();
    public ArrayList<String[]> cardapios = new ArrayList<>();

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
        this.cardapios = cardapios;
    }

    public void setCardapios(ArrayList<String[]> cardapios) {
        this.cardapios = cardapios;
    }

    // Login login;
    // Cliente cliente;
    // Registro registro;
    // Cozinheiros cozinheiros;

    public static int posNaLista(Pessoa cozinheiro, LinkedList<Pessoa> listaCozinheiro) {
        int pos=0;
        for (int i = 0; i < listaCozinheiro.size(); i++) {
            if (listaCozinheiro.get(i) == cozinheiro) {
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
                        cliente.opcoesTelaClientes(listaCozinheiros, registro.getCardapios());
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
                            cozinheiros.exibirTelaCozinheiro(pos, cardapios);
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
                            setCardapios(registro.criarCardapio(novoCozinheiro));
                            //cardapios = registro.criarCardapio(novoCozinheiro);
                            System.out.println("Cadastro feito com sucesso!");
                        }
            }
}
