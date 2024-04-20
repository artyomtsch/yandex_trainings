import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        solve(a,b,c);
    }

    static void solve(int a, int b, int c) {
        if (a == 0) {
            if (b >= 0 && b == c*c) {
                System.out.println("MANY SOLUTIONS");
                return;
            } else {
                System.out.println("NO SOLUTION");
                return;
            }
        }
        if (b == 0 && a < 0) {
            System.out.println("NO SOLUTION");
            return;
        }

        if (c < 0) {
            System.out.println("NO SOLUTION");
            return;
        }

        if ((c*c-b) % a == 0) {
            System.out.println((c*c-b) / a);
            return;
        } else {
            System.out.println("NO SOLUTION");
            return;
        }
    }
}