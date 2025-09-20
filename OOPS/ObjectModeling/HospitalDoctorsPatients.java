package OOPS.ObjectModeling;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    Patient[] patients;
    int count;

    Doctor(String name, int size) {
        this.name = name;
        patients = new Patient[size];
        count = 0;
    }

    void consult(Patient p) {
        if (count < patients.length) {
            patients[count++] = p;
            System.out.println("Doctor " + name + " consulted patient " + p.name);
        }
    }
}

class Hospital {
    String name;
    Doctor[] doctors;
    Patient[] patients;
    int doctorCount;
    int patientCount;

    Hospital(String name, int doctorSize, int patientSize) {
        this.name = name;
        doctors = new Doctor[doctorSize];
        patients = new Patient[patientSize];
        doctorCount = 0;
        patientCount = 0;
    }

    void addDoctor(Doctor d) {
        if (doctorCount < doctors.length) doctors[doctorCount++] = d;
    }

    void addPatient(Patient p) {
        if (patientCount < patients.length) patients[patientCount++] = p;
    }
}
