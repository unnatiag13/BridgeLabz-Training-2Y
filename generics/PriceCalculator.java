import java.util.*;
public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double s = 0;
        for (Product p : items) s += p.getPrice();
        return s;
    }
    public static void main(String[] args) {
        List<Mobile> ms = Arrays.asList(new Mobile(15000), new Mobile(12000));
        System.out.println(calculateTotal(ms));
    }
}
