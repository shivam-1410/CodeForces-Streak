import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        int upperCount = 0;
        int lowerCount = 0;
 
        // Count uppercase and lowercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
 
            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
 
        // Convert according to the counts
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
 
        sc.close();
    }
}