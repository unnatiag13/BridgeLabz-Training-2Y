public class GenericPair<T,U> {
    private T first;
    private U second;
    public GenericPair(T f, U s){ first = f; second = s; }
    public T getFirst(){ return first; }
    public U getSecond(){ return second; }
    public static void main(String[] args) {
        GenericPair<String,Integer> p = new GenericPair<>("Amol", 20);
        System.out.println(p.getFirst() + " " + p.getSecond());
    }
}
