import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] rating = new int[n];
 
        for (int i = 0; i < n; i++) {
            rating[i] = sc.nextInt();
        }
 
        for (int i = 0; i < n; i++) {
            int rank = 1;
 
            for (int j = 0; j < n; j++) {
                if (rating[j] > rating[i]) {
                    rank++;
                }
            }
 
            System.out.print(rank + " ");
        }
    }
}