import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
 
            System.out.println((n * m + 1) / 2);
        }
 
        sc.close();
    }
}