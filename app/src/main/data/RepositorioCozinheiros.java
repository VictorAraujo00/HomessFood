
public class RepositorioCozinheiros {
    LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();
    public RepositorioCozinheiros(){
        this.listaCozinheiros= new LinkedList<>();
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
                    //teste
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
