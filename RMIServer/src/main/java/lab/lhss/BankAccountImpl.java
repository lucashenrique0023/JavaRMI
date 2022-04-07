package lab.lhss;

public class BankAccountImpl implements BankAccount {

    private double balance;

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void transfer(double amount, BankAccountImpl anotherAccount) {
        withdraw(amount);
        anotherAccount.deposit(amount);
    }

    public double getBalance() {
        return this.balance;
    }

}
