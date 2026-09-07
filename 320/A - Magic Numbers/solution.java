import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        int i = 0;
        boolean magic = true;
 
        while (i < s.length()) {
 
            // Check for "144"
            if (i + 2 < s.length() && s.substring(i, i + 3).equals("144")) {
                i += 3;
            }
 
            // Check for "14"
            else if (i + 1 < s.length() && s.substring(i, i + 2).equals("14")) {
                i += 2;
            }
 
            // Check for "1"
            else if (s.charAt(i) == '1') {
                i++;
            }
 
            // No valid magic number can start here
            else {
                magic = false;
                break;
            }
        }
 
        System.out.println(magic ? "YES" : "NO");
 
        sc.close();
    }
}