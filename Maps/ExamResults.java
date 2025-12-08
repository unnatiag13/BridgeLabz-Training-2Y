import java.util.*;
import java.util.stream.*;

public class Q19_ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String,Integer>> data = new HashMap<>();
        // subject -> (student -> marks)
        data.put("Math", new HashMap<>(Map.of("Alice", 95, "Bob", 78, "Carol", 88)));
        data.put("Physics", new HashMap<>(Map.of("Alice", 85, "Bob", 92, "Carol", 90)));
        data.put("Chemistry", new HashMap<>(Map.of("Alice", 70, "Bob", 65, "Carol", 75)));

        // 1. Top scorer per subject
        System.out.println("Top scorer per subject:");
        for(Map.Entry<String, Map<String,Integer>> e : data.entrySet()) {
            String subject = e.getKey();
            Map<String,Integer> scores = e.getValue();
            String top = Collections.max(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println(subject + " -> " + top + " (" + scores.get(top) + ")");
        }

        // 2. Average per subject
        System.out.println("\nAverage per subject:");
        for(Map.Entry<String, Map<String,Integer>> e : data.entrySet()) {
            double avg = e.getValue().values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println(e.getKey() + " -> " + avg);
        }

        // 3. Subjects where at least one student scored above 90
        System.out.println("\nSubjects with a score above 90:");
        for(Map.Entry<String, Map<String,Integer>> e : data.entrySet()) {
            boolean any = e.getValue().values().stream().anyMatch(m -> m > 90);
            if(any) System.out.println(e.getKey());
        }
    }
}
