import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int[] count = new int[4];
        for (char c : s.toCharArray()) {
            if (c != '+') {
                count[c - '0']++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num = 1; num <= 3; num++) {
            for (int i = 0; i < count[num]; i++) {
                sb.append(num).append("+");
            }
        }
        
      
        sb.setLength(sb.length() - 1);
        
        System.out.println(sb.toString());
    }
}