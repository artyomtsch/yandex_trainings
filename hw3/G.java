import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class G {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet();

        for (int i = 0; i < n; i++) {
            int before = sc.nextInt();
            int after = sc.nextInt();

            if (before < 0 || after < 0) {
                continue;
            }

            if (before + after != n-1) {
                continue;
            }

            int place = n - after;
            set.add(place);
        }

        System.out.println(set.size());
    }
}