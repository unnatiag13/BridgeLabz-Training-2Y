import java.util.*;
public class PrintAnimals {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a);
    }
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());
        printAnimals(dogs);
        printAnimals(cats);
    }
}
