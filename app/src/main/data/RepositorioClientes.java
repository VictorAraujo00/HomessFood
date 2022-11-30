import java.util.LinkedList;

public class RepositorioClientes {
    LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();

    public RepositorioClientes() {
        this.listaClientes = new LinkedList<>();
    }
    public void loginClientes(){
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
}
