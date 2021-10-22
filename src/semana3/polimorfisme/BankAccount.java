package semana3.polimorfisme;

public class BankAccount {
    private String accountName;
    protected double balance;

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        //balance = balance + amount
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        //balance = balance - amount
        return balance;
    }
}
