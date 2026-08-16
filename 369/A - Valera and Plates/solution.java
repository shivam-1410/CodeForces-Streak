import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int bowls = sc.nextInt();   // m
        int plates = sc.nextInt();  // k
 
        int wash = 0;
 
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
 
            if (x == 1) { // only bowl
                if (bowls > 0) {
                    bowls--;
                } else {
                    wash++;
                }
            } else { // type 2: plate or bowl
                if (plates > 0) {
                    plates--;
                } else if (bowls > 0) {
                    bowls--;
                } else {
                    wash++;
                }
            }
        }
 
        System.out.println(wash);
    }
}