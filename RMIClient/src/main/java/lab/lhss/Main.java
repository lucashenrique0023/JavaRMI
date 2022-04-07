package lab.lhss;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) throws Exception {
        BankAccount account = (BankAccount) Naming.lookup("rmi://localhost:1099/account");

        account.deposit(1000);
        account.withdraw(200);
        System.out.println(account.getBalance());
    }

}
