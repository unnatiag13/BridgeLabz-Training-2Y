public class CompareTwoValues {
    public static <T> boolean isEqual(T a, T b) { return a == null ? b == null : a.equals(b); }
    public static void main(String[] args) {
        System.out.println(isEqual("hi","hi"));
        System.out.println(isEqual(10,20));
        System.out.println(isEqual(null,null));
    }
}
