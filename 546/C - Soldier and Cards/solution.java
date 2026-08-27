import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
 
        int k1 = sc.nextInt();
 
        for (int i = 0; i < k1; i++) {
            first.add(sc.nextInt());
        }
 
        int k2 = sc.nextInt();
 
        for (int i = 0; i < k2; i++) {
            second.add(sc.nextInt());
        }
 
        // Store previously seen game states
        Set<String> seen = new HashSet<>();
 
        int fights = 0;
 
        while (!first.isEmpty() && !second.isEmpty()) {
 
            String state = first.toString() + "|" + second.toString();
 
            // Same state appeared before -> infinite game
            if (seen.contains(state)) {
                System.out.println(-1);
                return;
            }
 
            seen.add(state);
 
            int card1 = first.poll();
            int card2 = second.poll();
 
            fights++;
 
            if (card1 > card2) {
                first.add(card2);
                first.add(card1);
            } else {
                second.add(card1);
                second.add(card2);
            }
        }
 
        if (first.isEmpty()) {
            System.out.println(fights + " 2");
        } else {
            System.out.println(fights + " 1");
        }
 
        sc.close();
    }
}