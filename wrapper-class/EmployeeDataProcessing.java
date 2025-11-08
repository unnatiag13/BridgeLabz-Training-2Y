import java.util.*;
public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {22, 30, 45, 25};
        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) list.add(age);
        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}
