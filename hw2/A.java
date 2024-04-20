import java.util.Scanner;

public class A
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");

        boolean isFirstValue = true;
        int prev = 0;
        for (String value : values) {
            if (isFirstValue) {
                isFirstValue = false;
                prev = Integer.parseInt(value);
                continue;
            }

            int cur = Integer.parseInt(value);
            if (cur <= prev) {
                System.out.println("NO");
                return;
            }
            prev = cur;
        }

        System.out.println("YES");
    }
}