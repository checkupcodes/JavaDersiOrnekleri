
public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            System.out.println("Negatif deger giremezsiniz !");

        }

    }
    public void setBalance() {

    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }


}
