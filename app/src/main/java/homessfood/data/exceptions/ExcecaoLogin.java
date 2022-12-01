package homessfood.data.exceptions;

public class ExcecaoLogin extends Exception{
    public ExcecaoLogin(){
        super("Usuário não corresponde / Senha incorreta");
    }
}
