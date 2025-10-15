interface vehicle{
    void rent();
    void returnVehicle();
}

class Car implements vehicle{
    public void rent(){
        System.out.println("Car has been rented!");
    }
    public void returnVehicle(){
        System.out.println("Car has been returned!");
    }
}
class Bike implements vehicle{
    public void rent(){
        System.out.println("Bike has been rented!");
    }
    public void returnVehicle(){
        System.out.println("Bike has been returned!");
    }
}
class Bus implements vehicle{
    public void rent(){
        System.out.println("Bus has been rented!");
    }
    public void returnVehicle(){
        System.out.println("Bus has been returned!");
    }
}

public class VehicleRental{
    public static void main(String[] args) {
        vehicle car = new Car();
        vehicle bike = new Bike();
        vehicle bus = new Bus();

        car.rent();
        bus.rent();
        bike.rent();
    }
}