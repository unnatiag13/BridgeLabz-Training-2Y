import java.util.*;
import java.util.stream.Collectors;

public class Q14_EmployeeSalary {
    public static void main(String[] args) {
        Map<String, Double> emp = new HashMap<>();
        emp.put("Alice", 50000.0);
        emp.put("Bob", 75000.0);
        emp.put("Carol", 60000.0);
        emp.put("David", 90000.0);
        emp.put("Eve", 45000.0);
        emp.put("Frank", 90000.0);

        // Give raises
        giveRaise(emp, "Alice", 10); // +10%
        giveRaise(emp, "Zoe", 5); // not found

        // Average salary
        double avg = emp.values().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.println("Average salary: " + avg);

        // Highest-paid employees
        double max = emp.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
        System.out.println("Highest salary: " + max);
        System.out.println("Employee(s) with highest salary:");
        emp.entrySet().stream()
            .filter(e -> e.getValue() == max)
            .forEach(e -> System.out.println(e.getKey()));
    }

    static void giveRaise(Map<String, Double> emp, String name, double percent) {
        if(!emp.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        emp.put(name, emp.get(name) * (1 + percent/100.0));
    }
}
