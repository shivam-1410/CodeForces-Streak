import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int best4 = -1;
        int best7 = -1;
        int minDigits = Integer.MAX_VALUE;
 
        // Try different numbers of 7s
        for (int sevens = 0; sevens * 7 <= n; sevens++) {
 
            int remaining = n - sevens * 7;
 
            if (remaining % 4 == 0) {
                int fours = remaining / 4;
                int digits = fours + sevens;
 
                if (digits < minDigits) {
                    minDigits = digits;
                    best4 = fours;
                    best7 = sevens;
                }
            }
        }
 
        // No possible lucky number
        if (best4 == -1) {
            System.out.println(-1);
            return;
        }
 
        // Put 4s first, then 7s
        StringBuilder ans = new StringBuilder();
 
        for (int i = 0; i < best4; i++) {
            ans.append('4');
        }
 
        for (int i = 0; i < best7; i++) {
            ans.append('7');
        }
 
        System.out.println(ans);
 
        sc.close();
    }
}