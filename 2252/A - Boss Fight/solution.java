import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] freq = new int[1001];
            int sum = 0;
            int maxFreq = 0;
            int maxValue = 0;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
 
                sum += x;
                freq[x]++;
 
                if (freq[x] > maxFreq) {
                    maxFreq = freq[x];
                    maxValue = x;
                }
            }
 
            int other = n - maxFreq;
 
            int usableMax = Math.min(maxFreq, other + 2);
 
            int answer = sum - (maxFreq * maxValue)
                       + (usableMax * maxValue);
 
            System.out.println(answer);
        }
 
        sc.close();
    }
}