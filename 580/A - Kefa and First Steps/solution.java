import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        int best = 1;
        int current = 1;
 
        for (int i = 1; i < n; i++) {
            if (a[i] >= a[i - 1]) {
                current++;
            } else {
                current = 1;
            }
            best = Math.max(best, current);
        }
 
        System.out.println(best);
    }
}