import java.util.*;
public class PerformanceImpact {
    public static void main(String[] args) {
        int size = 1000000;
        int[] arr = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr[i] = i;
            list.add(i);
        }
        long start = System.currentTimeMillis();
        long sum1 = 0;
        for (int i : arr) sum1 += i;
        long end = System.currentTimeMillis();
        System.out.println("int[] time: " + (end - start));
        start = System.currentTimeMillis();
        long sum2 = 0;
        for (int i : list) sum2 += i;
        end = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> time: " + (end - start));
    }
}
