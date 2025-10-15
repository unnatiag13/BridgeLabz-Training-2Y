import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        double currentTemp = 42.5;
        double threshold = 40.0;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature is too high: " + currentTemp);
        } else {
            System.out.println("Temperature is normal: " + currentTemp);
        }
    }
}
