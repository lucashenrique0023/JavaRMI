package lab.lhss;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    public static void main(String[] args) throws Exception {

        BankAccount account = new BankAccountImpl();
        BankAccount accountStub = (BankAccount) UnicastRemoteObject.exportObject(account, 0);

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("account", accountStub);

        System.out.println("Waiting requests");
    }
}
