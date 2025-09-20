package OOPS.PolymorphismAndEncapsulation;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private String records = "";

    InPatient(String id, String name, int age) { super(id, name, age); }

    @Override
    double calculateBill() { return 5000; }

    @Override
    public void addRecord(String record) { records += record + "\n"; }

    @Override
    public void viewRecords() { System.out.println(records); }
}

class OutPatient extends Patient {
    OutPatient(String id, String name, int age) { super(id, name, age); }

    @Override
    double calculateBill() { return 500; }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("P001","Alice",30),
            new OutPatient("P002","Bob",25)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
