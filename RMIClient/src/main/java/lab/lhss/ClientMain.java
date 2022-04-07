package lab.lhss;

import java.rmi.Naming;

public class ClientMain {

    public static void main(String[] args) throws Exception {
        BankAccount account1 = (BankAccount) Naming.lookup("rmi://localhost:1099/account1");
        BankAccount account2 = (BankAccount) Naming.lookup("rmi://localhost:1099/account2");

        account1.deposit(1000);
        account1.withdraw(200);
        account1.transfer(100, account2);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }

}
