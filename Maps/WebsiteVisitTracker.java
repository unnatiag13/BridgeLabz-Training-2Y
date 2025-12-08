import java.util.*;
import java.util.stream.*;

public class Q15_WebsiteVisitTracker {
    public static void main(String[] args) {
        Map<String,Integer> visits = new HashMap<>();
        String[] seq = {"home","about","products","home","products","contact","home","products","home","about"};
        for(String p : seq) visits.put(p, visits.getOrDefault(p,0) + 1);

        System.out.println("Visits per page:");
        visits.forEach((k,v) -> System.out.println(k + " -> " + v));

        // Sorted by descending visit count
        System.out.println("\nPages sorted by descending visits:");
        visits.entrySet().stream()
            .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        // Page with most visits
        String top = Collections.max(visits.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nMost visited page: " + top);
    }
}
