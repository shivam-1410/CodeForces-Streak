import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        long n = s.length();
        long answer = (n + 1) * 26 - n;
        System.out.println(answer);
    }
}