package homessfood.Facade;

import homessfood.data.RepositorioPessoas;


public class Facade implements IFacade {

    private RepositorioPessoas rPessoas;

    public Facade() {
        this.rPessoas = new RepositorioPessoas();
    }

    @Override
    public void loginClientes() throws Exception {
        this.rPessoas.loginClientes();
        
    }

    @Override
    public void loginCozinheiros() throws Exception {
        this.rPessoas.loginCozinheiros();
        
    }

    @Override
    public void cadastroClientes() {
        this.rPessoas.cadastroClientes();
    }

    @Override
    public void cadastroCozinheiros() {
        this.rPessoas.cadastroCozinheiros();
    }
    
}
