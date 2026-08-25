import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            // Odd-numbered rows: complete snake body
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
 
            // Even-numbered rows: snake moves vertically
            else if (i % 4 == 1) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            }
 
            // Even-numbered rows: snake moves vertically
            else {
                System.out.print("#");
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}