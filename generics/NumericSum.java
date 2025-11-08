import java.util.*;
public class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double s = 0;
        for (Number n : list) s += n.doubleValue();
        return s;
    }
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4);
        List<Double> ld = Arrays.asList(1.5,2.5,3.0);
        System.out.println(sumNumbers(li));
        System.out.println(sumNumbers(ld));
    }
}
