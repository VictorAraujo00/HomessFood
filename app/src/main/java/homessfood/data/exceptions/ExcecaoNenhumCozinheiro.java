package homessfood.data.exceptions;

public class ExcecaoNenhumCozinheiro extends Exception{
    public ExcecaoNenhumCozinheiro(){
        super("Não temos cozinheiros disponíveis no momento.");
    }
}
