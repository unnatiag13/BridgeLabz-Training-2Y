package OOPS.OOPFeatures;

class Vehicle {
    private static double registrationFee = 5000;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType +
                               ", Registration#: " + registrationNumber +
                               ", Fee: " + registrationFee);
        }
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

