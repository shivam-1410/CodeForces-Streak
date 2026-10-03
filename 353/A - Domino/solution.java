import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int upperSum = 0;
        int lowerSum = 0;
        boolean mixed = false;
 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            upperSum += x;
            lowerSum += y;
 
            if ((x % 2) != (y % 2)) {
                mixed = true;
            }
        }
 
        if (upperSum % 2 == 0 && lowerSum % 2 == 0) {
            System.out.println(0);
        } else if (upperSum % 2 != lowerSum % 2) {
            System.out.println(-1);
        } else if (mixed) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
 
        sc.close();
    }
}