import java.util.*;

public class CopyListElements {
    public static void copyList(List<Number> dest, List<Number> src) {
        for (Number n : src) {
            dest.add(n);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Number> src = Arrays.asList(1, 2, 3);
        copyList(dest, src);
        System.out.println(dest);
    }
}
