import java.util.Scanner;
 
public class A282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (s.contains("+")) x++;
            else x--;
        }
        System.out.println(x);
    }
}