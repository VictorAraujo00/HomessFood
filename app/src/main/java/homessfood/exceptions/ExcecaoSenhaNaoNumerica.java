package homessfood.exceptions;

public class ExcecaoSenhaNaoNumerica extends Exception {
    public ExcecaoSenhaNaoNumerica(){
        super("Senha não numérica, digite novamente.");
    }
}
