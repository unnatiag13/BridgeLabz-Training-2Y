package OOPS.ObjectModeling;

class CourseUM {
    String name;
    Professor professor;
    StudentUM[] students;
    int studentCount;

    CourseUM(String name, int size) {
        this.name = name;
        students = new StudentUM[size];
        studentCount = 0;
    }

    void assignProfessor(Professor p) {
        professor = p;
        System.out.println(p.name + " assigned to teach " + name);
    }

    void enrollStudent(StudentUM s) {
        if (studentCount < students.length) {
            students[studentCount++] = s;
            s.addCourse(this);
            System.out.println(s.name + " enrolled in " + name);
        }
    }
}

class StudentUM {
    String name;
    CourseUM[] courses;
    int courseCount;

    StudentUM(String name, int size) {
        this.name = name;
        courses = new CourseUM[size];
        courseCount = 0;
    }

    void addCourse(CourseUM c) {
        if (courseCount < courses.length) courses[courseCount++] = c;
    }
}

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}
