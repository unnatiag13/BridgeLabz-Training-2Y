import java.util.*;
public class StudentMarksReport {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "88", "abc"};
        ArrayList<Integer> marks = new ArrayList<>();
        for (String s : inputs) {
            try {
                if (!s.equals("null")) marks.add(Integer.valueOf(s));
            } catch (Exception e) {}
        }
        double avg = 0;
        for (int m : marks) avg += m;
        avg /= marks.size();
        System.out.println("Average: " + avg);
    }
}
