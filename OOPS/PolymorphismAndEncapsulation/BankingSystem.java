package OOPS.PolymorphismAndEncapsulation;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    SavingsAccount(String accNo, String name, double balance) { super(accNo, name, balance); }

    @Override
    double calculateInterest() { return getBalance() * 0.04; }

    @Override
    public void applyForLoan(double amount) { System.out.println("Loan applied: " + amount); }

    @Override
    public boolean calculateLoanEligibility(double amount) { return getBalance() >= amount * 0.2; }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accNo, String name, double balance) { super(accNo, name, balance); }

    @Override
    double calculateInterest() { return 0; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("S001", "Alice", 50000),
            new CurrentAccount("C001", "Bob", 30000)
        };

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + " balance: " + acc.getBalance() +
                               ", interest: " + acc.calculateInterest());
        }
    }
}
