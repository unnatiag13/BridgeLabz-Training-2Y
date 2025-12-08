import java.util.*;
import java.util.stream.Collectors;

public class Q16_BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC1001", 15000.0);
        accounts.put("ACC1002", 250000.0);
        accounts.put("ACC1003", 50000.0);
        accounts.put("ACC1004", 750000.0);
        accounts.put("ACC1005", 125000.0);

        // Add new customer
        accounts.put("ACC1006", 20000.0);

        // Deposits and withdrawals
        deposit(accounts, "ACC1001", 5000);
        withdraw(accounts, "ACC1003", 60000); // exceeds balance
        withdraw(accounts, "ACC1002", 50000); // ok

        // Print all customers sorted by descending balance
        System.out.println("\nCustomers sorted by descending balance:");
        accounts.entrySet().stream()
            .sorted((a,b) -> Double.compare(b.getValue(), a.getValue()))
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Top 3 customers
        System.out.println("\nTop 3 customers:");
        accounts.entrySet().stream()
            .sorted((a,b) -> Double.compare(b.getValue(), a.getValue()))
            .limit(3)
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }

    static void deposit(Map<String, Double> accounts, String acc, double amt) {
        accounts.put(acc, accounts.getOrDefault(acc,0.0) + amt);
        System.out.println("Deposited " + amt + " to " + acc);
    }

    static void withdraw(Map<String, Double> accounts, String acc, double amt) {
        if(!accounts.containsKey(acc)) {
            System.out.println("Account not found: " + acc);
            return;
        }
        double bal = accounts.get(acc);
        if(amt > bal) {
            System.out.println("Withdrawal failed for " + acc + ": insufficient funds.");
            return;
        }
        accounts.put(acc, bal - amt);
        System.out.println("Withdrew " + amt + " from " + acc);
    }
}
