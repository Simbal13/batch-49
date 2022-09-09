package PackageTest;

public class BankAccount {
    private String AccountHolderName;
    private String AccountHolderNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountHolderNumber, double balance) {
        AccountHolderName = accountHolderName;
        AccountHolderNumber = accountHolderNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountHolderName='" + AccountHolderName + '\'' +
                ", AccountHolderNumber='" + AccountHolderNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountHolderNumber() {
        return AccountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        AccountHolderNumber = accountHolderNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(balance>amount){
            balance=balance-amount;
        System.out.println("deposited suuccessfully");}

      else {
            System.out.println("insufficient balance");
    }}
    public void deposit(double amount){
            balance=balance+amount;
        }

    }








