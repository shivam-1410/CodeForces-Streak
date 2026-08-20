import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
 
        st.nextToken();
        int n = (int) st.nval;
 
        int[] cnt = new int[8];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            int a = (int) st.nval;
            cnt[a]++;
        }
 
        StringBuilder sb = new StringBuilder();
 
        if (cnt[5] != 0 || cnt[7] != 0) {
            System.out.println(-1);
            return;
        }
 
        int z = cnt[3];              // (1,3,6)
        int x = cnt[4];              // (1,2,4)
        int y = cnt[1] - x - z;      // (1,2,6)
 
        boolean ok = true;
        if (x < 0 || y < 0 || z < 0) ok = false;
        if (ok && cnt[2] != x + y) ok = false;
        if (ok && cnt[6] != y + z) ok = false;
        if (ok && 3L * (x + y + z) != n) ok = false;
 
        if (!ok) {
            System.out.println(-1);
            return;
        }
 
        for (int i = 0; i < x; i++) sb.append("1 2 4
");
        for (int i = 0; i < y; i++) sb.append("1 2 6
");
        for (int i = 0; i < z; i++) sb.append("1 3 6
");
 
        System.out.print(sb);
    }
}