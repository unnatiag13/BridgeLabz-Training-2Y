import java.util.*;

public class Q10_WordFrequencySentence {
    public static Map<String,Integer> wordFreq(String sentence) {
        Map<String,Integer> m = new HashMap<>();
        if(sentence == null) return m;
        String cleaned = sentence.toLowerCase().replaceAll("[^a-z0-9']+", " ");
        for(String w : cleaned.trim().split("\\s+")) {
            if(w.isEmpty()) continue;
            m.put(w, m.getOrDefault(w,0)+1);
        }
        return m;
    }

    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";
        System.out.println("Sentence: " + s);
        System.out.println("Word counts: " + wordFreq(s));
    }
}
