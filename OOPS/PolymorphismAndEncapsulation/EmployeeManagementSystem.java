package OOPS.PolymorphismAndEncapsulation;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee implements Department {
    private String dept;

    FullTimeEmployee(int id, String name, double salary) { super(id, name, salary); }

    @Override
    double calculateSalary() { return getBaseSalary(); }

    @Override
    public void assignDepartment(String deptName) { this.dept = deptName; }

    @Override
    public String getDepartmentDetails() { return dept; }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String dept;

    PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hoursWorked = hours;
    }

    @Override
    double calculateSalary() { return getBaseSalary() * hoursWorked; }

    @Override
    public void assignDepartment(String deptName) { this.dept = deptName; }

    @Override
    public String getDepartmentDetails() { return dept; }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee(1, "Alice", 50000),
            new PartTimeEmployee(2, "Bob", 500, 100)
        };

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
