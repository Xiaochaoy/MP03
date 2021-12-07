package UF5.exceptions.a2;

public class ClientAccountException extends Exception{

    public ClientAccountException(String msg) {
        super(msg);
    }

    //CLIENT MESSAGES
    public static final String WRONG_DNI = "DNI incorrecte";
}
