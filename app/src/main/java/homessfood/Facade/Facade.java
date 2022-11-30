package homessfood.Facade;

import homessfood.data.RepositorioPessoas;

public class Facade implements IFacade {

    private RepositorioPessoas rPessoas;

    public Facade() {
        this.rPessoas = new RepositorioPessoas();
    }

    @Override
    public void loginClientes() throws Exception {
        
        
    }

    @Override
    public void loginCozinheiros() throws Exception {
        
        
    }

    @Override
    public void cadastroClientes() {
        
        
    }

    @Override
    public void cadastroCozinheiros() {
        
        
    }
    
}
