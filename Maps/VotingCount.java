import java.util.*;

public class Q8_VotingCount {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        List<String> candidates = Arrays.asList("Alice","Bob","Carol");

        // Simulate 10 votes
        String[] simulatedVotes = {"Alice","Bob","Alice","Carol","Bob","Bob","Alice","Carol","Bob","Alice"};
        for(String v : simulatedVotes) {
            votes.put(v, votes.getOrDefault(v,0) + 1);
        }

        System.out.println("Vote counts:");
        for(String c : candidates) {
            System.out.println(c + " -> " + votes.getOrDefault(c,0));
        }

        // Find winner
        String winner = null;
        int max = -1;
        for(Map.Entry<String,Integer> e : votes.entrySet()) {
            if(e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + max + " votes.");
    }
}
