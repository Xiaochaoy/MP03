package UF5.exceptions.a2;

public class BankAccountException extends Exception{

    public BankAccountException(String msg) {
            super(msg);
    }

    //BANK ACCOUNT MESSAGES
    public static final String ACCOUNT_NOT_FOUND = "Compte inexistent";
    public static final String ACCOUNT_OVERDRAFT = "Compte al descobert (Que no tienes dinero !!!)";
    public static final String ACCOUNT_ZERO_USER = "Compte sense usuari";
    public static final String LAST_ACCOUNT = "Solo queda un usuario";
}
