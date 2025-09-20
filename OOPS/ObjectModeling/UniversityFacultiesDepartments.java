package OOPS.ObjectModeling;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class Department {
    String name;
    Department(String name) { this.name = name; }
}

class University {
    String name;
    Department[] departments;
    int deptCount;
    Faculty[] faculties;
    int facultyCount;

    University(String name, int deptSize, int facultySize) {
        this.name = name;
        departments = new Department[deptSize];
        faculties = new Faculty[facultySize];
        deptCount = 0;
        facultyCount = 0;
    }

    void addDepartment(Department d) {
        if (deptCount < departments.length) departments[deptCount++] = d;
    }

    void addFaculty(Faculty f) {
        if (facultyCount < faculties.length) faculties[facultyCount++] = f;
    }
}
