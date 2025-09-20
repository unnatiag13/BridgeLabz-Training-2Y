package OOPS.AccessModifiers;

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println(accountNumber + " - " + accountHolder + " - Interest: " + interestRate + "%");
    }
}
