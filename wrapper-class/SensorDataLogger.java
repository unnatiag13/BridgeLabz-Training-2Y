public class SensorDataLogger {
    public static void logData(Double data) {
        System.out.println("Stored: " + data);
    }
    public static void main(String[] args) {
        double temp1 = 36.5;
        Double temp2 = 37.2;
        logData(temp1);
        logData(temp2);
    }
}
