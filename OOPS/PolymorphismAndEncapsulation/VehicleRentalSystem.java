package OOPS.PolymorphismAndEncapsulation;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rate) { this.rentalRate = rate; }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    Car(String number, double rate) { super(number, "Car", rate); }

    @Override
    double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.1; }

    @Override
    public String getInsuranceDetails() { return "Car insurance 10% of rate"; }
}

class Bike extends Vehicle implements Insurable {
    Bike(String number, double rate) { super(number, "Bike", rate); }

    @Override
    double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return getRentalRate() * 0.05; }

    @Override
    public String getInsuranceDetails() { return "Bike insurance 5% of rate"; }
}

class Truck extends Vehicle {
    Truck(String number, double rate) { super(number, "Truck", rate); }

    @Override
    double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("C101", 1000),
            new Bike("B101", 500),
            new Truck("T101", 2000)
        };

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber() +
                               " rental cost for 3 days: " + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails() + ": " +
                                   ((Insurable)v).calculateInsurance());
            }
        }
    }
}
