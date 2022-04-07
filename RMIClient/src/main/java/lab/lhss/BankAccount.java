package lab.lhss;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankAccount extends Remote {

    void withdraw(double amount) throws RemoteException;
    void deposit(double amount) throws RemoteException;
    void transfer(double amount, BankAccount anotherAccount) throws RemoteException;
    double getBalance() throws RemoteException;

}
