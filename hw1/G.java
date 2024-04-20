import java.util.Scanner;

public class G
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");

        int N = Integer.parseInt(values[0]);
        int K = Integer.parseInt(values[1]);
        int M = Integer.parseInt(values[2]);

        if (K > N || M > K) {
            System.out.println("0");
            return;
        }

        int details = 0;

        while (N / K > 0) {
            int blanks = 0;

            blanks = N / K;
            int remainder = N % K;
            details += blanks * (K / M);
            remainder += (K % M) * blanks;
            N = remainder;
        }

        System.out.println(details);
    }
}