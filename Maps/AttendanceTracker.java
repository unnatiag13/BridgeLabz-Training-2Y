import java.util.*;

public class Q11_AttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice","Bob","Carol","David","Eve");
        Map<String,Integer> attendance = new HashMap<>();
        for(String s : students) attendance.put(s, 0);

        // Simulate 15 days; each day list of present students
        List<List<String>> days = new ArrayList<>();
        Random rnd = new Random(1);
        for(int d=0; d<15; d++) {
            List<String> present = new ArrayList<>();
            for(String s : students) {
                if(rnd.nextDouble() < 0.7) present.add(s); // 70% chance present
            }
            days.add(present);
        }

        // Mark attendance
        for(int d=0; d<days.size(); d++) {
            for(String p : days.get(d)) {
                attendance.put(p, attendance.getOrDefault(p,0) + 1);
            }
        }

        System.out.println("Attendance counts:");
        attendance.forEach((k,v)-> System.out.println(k + " -> " + v));

        System.out.println("\nStudents present fewer than 10 days:");
        for(Map.Entry<String,Integer> e : attendance.entrySet()) {
            if(e.getValue() < 10) System.out.println(e.getKey() + " (" + e.getValue() + ")");
        }
    }
}
