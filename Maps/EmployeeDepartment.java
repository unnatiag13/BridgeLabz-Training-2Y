import java.util.*;
import java.util.stream.Collectors;

public class Q18_EmployeeDepartment {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Sales");
        empDept.put(104, "IT");
        empDept.put(105, "HR");

        // Change department of an employee
        empDept.put(103, "Marketing");

        // Find all employees in a department (reverse lookup)
        String deptToFind = "IT";
        System.out.println("Employees in " + deptToFind + ":");
        empDept.entrySet().stream()
            .filter(e -> e.getValue().equals(deptToFind))
            .forEach(e -> System.out.println(e.getKey()));

        // Total employees per department
        Map<String, Long> counts = empDept.values().stream()
            .collect(Collectors.groupingBy(d -> d, Collectors.counting()));
        System.out.println("\nEmployees per department:");
        counts.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
