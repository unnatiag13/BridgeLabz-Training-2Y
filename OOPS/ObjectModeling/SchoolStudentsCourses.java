package OOPS.ObjectModeling;

class Course {
    String name;
    Student[] students;
    int count;

    Course(String name, int size) {
        this.name = name;
        students = new Student[size];
        count = 0;
    }

    void enroll(Student s) {
        if (count < students.length) {
            students[count++] = s;
            s.addCourse(this);
        }
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (int i = 0; i < count; i++) System.out.println(" - " + students[i].name);
    }
}

class Student {
    String name;
    Course[] courses;
    int count;

    Student(String name, int size) {
        this.name = name;
        courses = new Course[size];
        count = 0;
    }

    void addCourse(Course c) {
        if (count < courses.length) courses[count++] = c;
    }

    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (int i = 0; i < count; i++) System.out.println(" - " + courses[i].name);
    }
}

class School {
    String name;
    Student[] students;
    int count;

    School(String name, int size) {
        this.name = name;
        students = new Student[size];
        count = 0;
    }

    void addStudent(Student s) {
        if (count < students.length) students[count++] = s;
    }
}
