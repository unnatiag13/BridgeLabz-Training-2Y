interface SmartDevice{
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice{
    public void turnOn(){
        System.out.println("Light is turned on..");
    }
    public void turnOff(){
        System.out.println("Light is turned off..");
    }
}

class AirConditioner implements SmartDevice{
    public void turnOn(){
        System.out.println("Air Conditioner is turned on..");
    }
    public void turnOff(){
        System.out.println("Air Conditioner is turned off..");
    }
}

class TV implements SmartDevice{
    public void turnOn(){
        System.out.println("TV is turned ON...");
    }
    public void turnOff(){
        System.out.println("TV is turned Off...");
    }
}

public class SmartHome{
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

    }
}
