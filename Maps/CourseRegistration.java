import java.util.*;

public class Q13_CourseRegistration {
    public static void main(String[] args) {
        Map<String,Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 52);
        courses.put("CS103", 3);
        courses.put("CS104", 10);
        courses.put("CS105", 49);

        // Add or drop students
        register(courses, "CS101", 3); // +3
        drop(courses, "CS103", 2); // -2, but not below 0
        drop(courses, "CS106", 1); // non-existent

        // Print near full (>=50) and under-subscribed (<5)
        System.out.println("Courses near full (>=50):");
        for(Map.Entry<String,Integer> e : courses.entrySet()) {
            if(e.getValue() >= 50) System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println("\nUnder-subscribed (<5):");
        for(Map.Entry<String,Integer> e : courses.entrySet()) {
            if(e.getValue() < 5) System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void register(Map<String,Integer> courses, String code, int n) {
        courses.put(code, courses.getOrDefault(code,0) + n);
    }

    static void drop(Map<String,Integer> courses, String code, int n) {
        if(!courses.containsKey(code)) {
            System.out.println("Course " + code + " not found.");
            return;
        }
        int cur = courses.get(code) - n;
        if(cur < 0) cur = 0;
        courses.put(code, cur);
    }
}
