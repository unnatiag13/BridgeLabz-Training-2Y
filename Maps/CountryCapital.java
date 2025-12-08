import java.util.*;

public class Q12_CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India","New Delhi");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        map.put("Australia","Canberra");
        map.put("Brazil","Brasilia");
        map.put("Canada","Ottawa");
        map.put("Germany","Berlin");
        map.put("Egypt","Cairo");

        // Lookup example
        lookup(map, "India");
        lookup(map, "Spain");

        // Print all countries alphabetically
        System.out.println("\nAll countries and capitals sorted:");
        map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }

    static void lookup(Map<String,String> map, String country) {
        System.out.println("\nLookup: " + country);
        if(map.containsKey(country)) System.out.println("Capital: " + map.get(country));
        else System.out.println("Unknown country");
    }
}
