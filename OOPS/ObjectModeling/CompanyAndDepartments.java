package OOPS.ObjectModeling;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Department {
    String name;
    Employee[] employees;
    int count;

    Department(String name, int size) {
        this.name = name;
        employees = new Employee[size];
        count = 0;
    }

    void addEmployee(Employee e) {
        if (count < employees.length) employees[count++] = e;
    }
}

class Company {
    String name;
    Department[] departments;
    int count;

    Company(String name, int size) {
        this.name = name;
        departments = new Department[size];
        count = 0;
    }

    void addDepartment(Department d) {
        if (count < departments.length) departments[count++] = d;
    }
}
