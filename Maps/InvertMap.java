import java.util.*;

public class Q2_InvertMap {
    public static <K,V> Map<V, List<K>> invert(Map<K,V> map) {
        Map<V, List<K>> inv = new HashMap<>();
        for(Map.Entry<K,V> e : map.entrySet()) {
            inv.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return inv;
    }

    public static void main(String[] args) {
        Map<String,Integer> input = new LinkedHashMap<>();
        input.put("A",1);
        input.put("B",2);
        input.put("C",1);
        System.out.println("Input: " + input);
        Map<Integer, List<String>> out = invert(input);
        System.out.println("Output: " + out);
    }
}
