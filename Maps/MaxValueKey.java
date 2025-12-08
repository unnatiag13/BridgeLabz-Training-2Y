import java.util.*;

public class Q3_MaxValueKey {
    public static String maxKey(Map<String,Integer> map) {
        String best = null;
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> e : map.entrySet()) {
            if(e.getValue() > max) {
                max = e.getValue();
                best = e.getKey();
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",10);
        m.put("B",20);
        m.put("C",15);
        System.out.println("Input: " + m);
        System.out.println("Key with max value: " + maxKey(m));
    }
}
