package OOPS.OOPFeatures;

class Student {
    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName + ", Name: " + name +
                               ", Roll#: " + rollNumber + ", Grade: " + grade);
        }
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}

