public class GenericBox<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    public static void main(String[] args) {
        GenericBox<Integer> b1 = new GenericBox<>();
        b1.set(10);
        System.out.println(b1.get());
        GenericBox<String> b2 = new GenericBox<>();
        b2.set("hello");
        System.out.println(b2.get());
        GenericBox<Double> b3 = new GenericBox<>();
        b3.set(3.14);
        System.out.println(b3.get());
    }
}
