package OOPS.InstanceVsClass;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " - " + duration + " months - " + fee + " - " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}
