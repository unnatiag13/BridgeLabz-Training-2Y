public interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle");
    }
}

class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class TestVehicle {
    public static void main(String[] args) {
        Vehicle car = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
    }
}
