import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        char current = 'a';
        int rotations = 0;
 
        for (int i = 0; i < s.length(); i++) {
 
            char target = s.charAt(i);
 
            int diff = Math.abs(target - current);
 
            rotations += Math.min(diff, 26 - diff);
 
            current = target;
        }
 
        System.out.println(rotations);
    }
}