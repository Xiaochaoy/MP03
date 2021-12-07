package UF5.exceptions.a2;

import java.util.ArrayList;
import java.util.List;

public class CompteEstalvi {
    private String numCompte;
    private double saldo;
    //Usuaris co-propietaris del compte
    private List<Client> llista_usuaris;

    public CompteEstalvi(String numCompte) {
        this.numCompte = numCompte;
        saldo = 0;
        llista_usuaris = new ArrayList<>();
    }

    /**
     Afegeix un usuari d'aquest compte
     @param client
     @return quantitat d'usuaris que té el compte
     **/
    public int addUser(Client client) {
        llista_usuaris.add(client);
        return llista_usuaris.size();
    }

    /**
     Elimina un usuari d'aquest compte
     @param dni
     @return quantitat d'usuaris que té el compte
     @throws //BankAccountException
     **/
    public int removeUser(String dni) throws BankAccountException{
        if (llista_usuaris.size() == 1){
            throw new BankAccountException(BankAccountException.LAST_ACCOUNT);
        }else {
            llista_usuaris.removeIf(u -> dni.equals(u.getDNI()));
        }
        return 0;
    }

    /**
     * Afegeix m diners al saldo
     * @param amount
     */
    public void ingressar(double amount) {
        saldo += amount;
    }

    /**
     * Treu m diners del compte si n'hi han suficient
     * @param m
     * @throws //BankAccountException
     */
    public void treure(double m) throws BankAccountException{
        if (saldo - m < 0 ) throw new BankAccountException(BankAccountException.ACCOUNT_OVERDRAFT);
        else saldo -= m;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Client> getLlista_usuaris() {
        return llista_usuaris;
    }
}
