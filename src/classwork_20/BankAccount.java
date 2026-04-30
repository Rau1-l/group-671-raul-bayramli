package classwork_20;

public class BankAccount {
    double bal;

    public BankAccount(double bal) {
        this.bal = bal;
    }

    public void deposit(double am) {
        bal += am;
        System.out.println("Пополнено. Баланс: " + bal);
    }

    public void withdraw(double am) {
        if (am > bal) {
            System.out.println("Недостаточно средств");
        } else {
            bal -= am;
            System.out.println("Снято. Баланс: " + bal);
        }
    }

    public double getBalance() { return bal; }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(670.0);
        acc.deposit(567.0);      
        acc.withdraw(267.0);     
        acc.withdraw(56767.0);    
    }
}