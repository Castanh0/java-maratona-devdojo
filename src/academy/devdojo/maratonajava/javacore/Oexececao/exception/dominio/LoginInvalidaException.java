package academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio;

public class LoginInvalidaException extends Exception{
    public LoginInvalidaException() {
        super("Login Invalido");
    }

    public LoginInvalidaException(String message) {
        super(message);
    }
}
