package homessfood.Facade;

import homessfood.data.RepositorioPessoas;

public class Facade implements IFacade {

    private RepositorioPessoas rPessoas;

    public Facade() {
        this.rPessoas = new RepositorioPessoas();
    }

    @Override
    public void loginClientes() throws Exception {
        rPessoas.loginClientes();
        
    }

    @Override
    public void loginCozinheiros() throws Exception {
        rPessoas.loginCozinheiros();
        
    }

    @Override
    public void cadastroClientes() {
        rPessoas.cadastroClientes();
    }

    @Override
    public void cadastroCozinheiros() {
        rPessoas.cadastroCozinheiros();
    }
    
}
