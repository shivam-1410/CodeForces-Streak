import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
 
        long countMin = 0;
        long countMax = 0;
 
        for (int i = 0; i < n; i++) {
            long beauty = sc.nextLong();
 
            // New minimum
            if (beauty < min) {
                min = beauty;
                countMin = 1;
            } else if (beauty == min) {
                countMin++;
            }
 
            // New maximum
            if (beauty > max) {
                max = beauty;
                countMax = 1;
            } else if (beauty == max) {
                countMax++;
            }
        }
 
        long maxDifference = max - min;
        long ways;
 
        if (min == max) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = countMin * countMax;
        }
 
        System.out.println(maxDifference + " " + ways);
 
        sc.close();
    }
}