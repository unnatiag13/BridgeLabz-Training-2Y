package OOPS.ObjectModeling;

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        balance = 0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;
    Customer[] customers;
    int count;

    Bank(String bankName, int size) {
        this.bankName = bankName;
        customers = new Customer[size];
        count = 0;
    }

    void openAccount(Customer c, double initialDeposit) {
        if (count < customers.length) {
            c.balance = initialDeposit;
            customers[count++] = c;
            System.out.println("Account opened for " + c.name + " in " + bankName);
        }
    }
}
