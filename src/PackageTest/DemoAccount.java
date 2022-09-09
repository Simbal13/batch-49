package PackageTest;

public class DemoAccount {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Pragra", "23456987",120000);


        System.out.println(account);

        account.withdraw(20000);
        System.out.println(account.getBalance());
account.withdraw(120000);
        System.out.println(account.getBalance());
        account.deposit(20000);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountHolderName());

    }
}
