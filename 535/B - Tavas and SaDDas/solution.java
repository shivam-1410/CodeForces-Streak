import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        String s = Long.toString(n);
 
        long ans = 0;
        int len = s.length();
 
        // All lucky numbers with fewer digits
        for (int i = 1; i < len; i++) {
            ans += (1L << i);
        }
 
        // Find the position among lucky numbers of the same length
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '7') {
                ans += (1L << (len - i - 1));
            }
        }
 
        // 0-indexed -> 1-indexed
        ans++;
 
        System.out.println(ans);
    }
}