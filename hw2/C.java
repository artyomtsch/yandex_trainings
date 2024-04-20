import java.util.Scanner;

public class C
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int ans = array[0];
        for (int i = 1; i < N; i++) {
            if (Math.abs(x-array[i]) < Math.abs(x-ans)) {
                ans = array[i];
            }
        }

        System.out.println(ans);
    }
}