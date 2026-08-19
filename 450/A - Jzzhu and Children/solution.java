import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        int maxTurns = 0;
        int answer = 0;
 
        for (int i = 0; i < n; i++) {
 
            int candies = sc.nextInt();
 
            // Number of times this child needs candies
            int turns = (candies + m - 1) / m;
 
            if (turns >= maxTurns) {
                maxTurns = turns;
                answer = i + 1;
            }
        }
 
        System.out.println(answer);
    }
}