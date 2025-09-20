package OOPS.PolymorphismAndEncapsulation;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId + " driven by " + driverName);
    }
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";

    Car(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double calculateFare(double distance) { return getRatePerKm() * distance; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location = "Unknown";

    Bike(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location = "Unknown";

    Auto(String id, String driver, double rate) { super(id, driver, rate); }

    @Override
    double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }

    @Override
    public String getCurrentLocation() { return location; }

    @Override
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101","Alice",10),
            new Bike("B101","Bob",8),
            new Auto("A101","Charlie",7)
        };

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Fare for 10km: " + v.calculateFare(10));
        }
    }
}
