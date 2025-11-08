import java.util.*;
import java.util.stream.*;
public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4, 2));
        ArrayList<Integer> all = new ArrayList<>();
        for (int n : arr) all.add(n);
        all.addAll(list);
        double avg = all.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average rating: " + avg);
    }
}
