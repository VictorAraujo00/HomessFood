package homessfood.data;

public interface IRepository {
    public void loginClientes() throws Exception;
    public void loginCozinheiros() throws Exception;
    public void cadastroClientes();
    public void cadastroCozinheiros();
}
