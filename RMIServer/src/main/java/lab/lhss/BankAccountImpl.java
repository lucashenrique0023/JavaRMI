package lab.lhss;

import java.rmi.RemoteException;

public class BankAccountImpl implements BankAccount {

    private double balance;

    public void withdraw(double amount) throws RemoteException {
        this.balance -= amount;
    }

    public void deposit(double amount) throws RemoteException {
        this.balance += amount;
    }

    public void transfer(double amount, BankAccount anotherAccount) throws RemoteException {
        withdraw(amount);
        anotherAccount.deposit(amount);
    }

    public double getBalance() throws RemoteException {
        return this.balance;
    }

}
