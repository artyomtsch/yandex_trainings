import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class H {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            set.add(x);
        }

        System.out.println(set.size());
    }
}