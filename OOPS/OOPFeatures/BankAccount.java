package OOPS.OOPFeatures;

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName +
                               ", Account#: " + accountNumber + ", Balance: " + balance);
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

