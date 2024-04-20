import java.util.Scanner;
import java.io.IOException;

public class D {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] frequency = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            int c = sc.nextInt();
            frequency[i] = c;
        }

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int pressed = sc.nextInt();
            if (frequency[pressed] < 0) {
                continue;
            } else {
                frequency[pressed] -= 1;
            }
        }

        for (int i = 1; i < n+1; i++) {
            if (frequency[i] < 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}