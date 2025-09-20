package OOPS.AccessModifiers;

class Manager extends Employee {
    String team;

    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    void display() {
        System.out.println(employeeID + " - " + department + " - Team: " + team);
    }
}

