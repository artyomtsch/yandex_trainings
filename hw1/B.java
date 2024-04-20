import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        if (a < (b+c) && b < (a+c) && c < (a+b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
