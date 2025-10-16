interface LightAction {
    void activate();
}

public class SmartLightAutomation {
    public static void main(String[] args) {
        LightAction motionSensor = () -> System.out.println("Lights ON : Motion detected! ");
        LightAction nightTime = () -> System.out.println("Lights dimmed for night time");
        LightAction voiceCommand = () ->System.out.println("Lights pattern activated by voice");

        motionSensor.activate();
        nightTime.activate();
        voiceCommand.activate();
        
    }
}
