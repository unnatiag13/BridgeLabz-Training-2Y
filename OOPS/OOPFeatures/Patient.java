package OOPS.OOPFeatures;

class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName + ", Name: " + name +
                               ", Age: " + age + ", Ailment: " + ailment +
                               ", PatientID: " + patientID);
        }
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}

