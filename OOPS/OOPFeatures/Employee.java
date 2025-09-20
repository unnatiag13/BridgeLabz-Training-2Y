package OOPS.OOPFeatures;

class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName + ", Name: " + name +
                               ", ID: " + id + ", Designation: " + designation);
        }
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

