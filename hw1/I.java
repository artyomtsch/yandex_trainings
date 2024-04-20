import java.util.Scanner;
import java.util.Arrays;

public class I
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        int D = Integer.parseInt(sc.nextLine());
        int E = Integer.parseInt(sc.nextLine());

        if (D < E) {
            int tmp = D;
            D = E;
            E = tmp;
        }

        int[] arr = new int[] {A,B,C};
        Arrays.sort(arr);
        A = arr[2];
        B = arr[1];
        C = arr[0];


        if (B <= D && C <= E) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}