import java.util.*;

public class Q6_StudentGradeTracker {
    public static void main(String[] args) {
        // Use TreeMap to keep alphabetical order by student name
        Map<String, Double> grades = new TreeMap<>();

        // 1. Adds several students
        grades.put("Ravi", 78.5);
        grades.put("Anita", 92.0);
        grades.put("Maya", 65.0);
        grades.put("Zara", 88.0);

        // Print initial
        System.out.println("Initial grades: " + grades);

        // 2. Update grade (retake)
        grades.put("Maya", 75.0); // update

        // 3. Remove student who dropped out
        grades.remove("Zara");

        // 4. Print sorted by name (TreeMap already sorted)
        System.out.println("After updates (sorted):");
        for(Map.Entry<String, Double> e : grades.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
