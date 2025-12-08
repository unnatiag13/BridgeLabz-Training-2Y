import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String toString() { return name; }
}

public class Q5_GroupEmployees {
    public static Map<String, List<Employee>> groupByDept(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();
        for(Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }
        return map;
    }

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
            new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Carol","HR")
        );
        Map<String,List<Employee>> grouped = groupByDept(emps);
        grouped.forEach((dept, list) -> {
            System.out.println(dept + ": " + list);
        });
    }
}
