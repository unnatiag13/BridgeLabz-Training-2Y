import java.util.*;
public class FruitBox<T extends Fruit> {
    private List<T> list = new ArrayList<>();
    public void add(T f){ list.add(f); }
    public void show(){ for (T f : list) System.out.println(f); }
    public static void main(String[] args) {
        FruitBox<Apple> ab = new FruitBox<>();
        ab.add(new Apple());
        ab.show();
        FruitBox<Mango> mb = new FruitBox<>();
        mb.add(new Mango());
        mb.show();
    }
}
