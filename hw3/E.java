import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class E {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        HashSet<Integer> hs = new HashSet();

        int num = sc.nextInt();
        if (num == 0 && num != x && num != y && num != z) {
            System.out.println(1);
            return;
        }

        while (num > 0) {
            int digit = num % 10;
            if (digit != x && digit != y && digit != z) {
                hs.add(digit);
            }
            num /= 10;
        }

        System.out.println(hs.size());
    }
}