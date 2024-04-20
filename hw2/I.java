import java.util.Scanner;
import java.util.Arrays;

public class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M, K;
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        int[][] field = new int[N][M];
        for (int[] row : field) {
            Arrays.fill(row, 0);
        }

        int[] y = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] x = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < K; i++) {
            int p, q;
            p = sc.nextInt() - 1;
            q = sc.nextInt() - 1;

            field[p][q] = -1;

            for (int j = 0; j < x.length; j++) {
                int P = p + y[j];
                int Q = q + x[j];

                if (P >= 0 && P < N && Q >= 0 && Q < M && field[P][Q] != -1) {
                    field[P][Q] += 1;
                }
            }

        }

        for (int[] row : field) {
            for (int number : row) {
                if (number == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }
    }
}