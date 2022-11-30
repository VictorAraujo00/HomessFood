package homessfood.data;

import java.util.LinkedList;

import homessfood.entities.Cliente;
import homessfood.entities.Cozinheiros;
import homessfood.entities.Login;
import homessfood.entities.Pessoa;
import homessfood.entities.Registro;
import homessfood.exceptions.ExcecaoLogin;

public class RepositorioClientes  {
    LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();
    LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();

    Login login;
    Cliente cliente;
    Registro registro;
    Cozinheiros cozinheiros;

    public static int posNaLista(Pessoa cozinheiroLogin, LinkedList<Pessoa> lista) {
        int pos=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == cozinheiroLogin) {
                pos = i;
            }
        }
        return pos;
    }

    public RepositorioClientes() {
        this.listaClientes = new LinkedList<>();
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
            try{
                Pessoa cozinheiroLogin = login.EntrarCozinheiro();
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
