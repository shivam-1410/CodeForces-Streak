import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        String[] words = s.split("(WUB)+");
        ArrayList<String> ans = new ArrayList<>();
 
        for (String word : words) {
            if (!word.isEmpty()) {
                ans.add(word);
            }
        }
 
        System.out.println(String.join(" ", ans));
 
        sc.close();
    }
}