import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        boolean removed = false;
        StringBuilder ans = new StringBuilder();
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
 
            // Remove the first 0
            if (ch == '0' && !removed) {
                removed = true;
            } else {
                ans.append(ch);
            }
        }
 
        // If there was no 0, remove the last 1
        if (!removed) {
            ans.deleteCharAt(ans.length() - 1);
        }
 
        System.out.println(ans);
 
        sc.close();
    }
}