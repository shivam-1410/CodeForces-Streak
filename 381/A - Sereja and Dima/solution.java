import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
 
        int left = 0;
        int right = n - 1;
        int sereja = 0;
        int dima = 0;
        boolean serejaTurn = true;
 
        while (left <= right) {
            int chosen;
 
            if (arr[left] > arr[right]) {
                chosen = arr[left];
                left++;
            } else {
                chosen = arr[right];
                right--;
            }
 
            if (serejaTurn) {
                sereja += chosen;
            } else {
                dima += chosen;
            }
 
            serejaTurn = !serejaTurn;
        }
 
        System.out.println(sereja + " " + dima);
 
        sc.close();
    }
}