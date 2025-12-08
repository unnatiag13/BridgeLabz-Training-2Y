import java.util.*;
import java.util.regex.*;

public class Q1_WordFrequency {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freq = new HashMap<>();
        if(text == null) return freq;
        // Normalize: lowercase and remove punctuation (keep apostrophes within words)
        String cleaned = text.toLowerCase();
        // Replace all non-letter/digit/apostrophe with space
        cleaned = cleaned.replaceAll("[^a-z0-9']+", " ");
        String[] parts = cleaned.trim().split("\\s+");
        for(String w : parts) {
            if(w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println("Input: " + input);
        Map<String,Integer> result = countWords(input);
        System.out.println("Output: " + result);
    }
}
