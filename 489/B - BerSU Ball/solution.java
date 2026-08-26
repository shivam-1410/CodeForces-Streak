import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] boys = new int[n];
 
        for (int i = 0; i < n; i++) {
            boys[i] = sc.nextInt();
        }
 
        int m = sc.nextInt();
        int[] girls = new int[m];
 
        for (int i = 0; i < m; i++) {
            girls[i] = sc.nextInt();
        }
 
        Arrays.sort(boys);
        Arrays.sort(girls);
 
        int i = 0;
        int j = 0;
        int pairs = 0;
 
        while (i < n && j < m) {
 
            if (Math.abs(boys[i] - girls[j]) <= 1) {
                // Valid pair
                pairs++;
                i++;
                j++;
            } 
            else if (boys[i] < girls[j]) {
                // Boy's skill is too small
                i++;
            } 
            else {
                // Girl's skill is too small
                j++;
            }
        }
 
        System.out.println(pairs);
 
        sc.close();
    }
}