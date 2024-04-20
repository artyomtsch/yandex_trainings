import java.util.Scanner;

// TL

public class H
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine()) + 1;
        int b = Integer.parseInt(sc.nextLine()) + 1;
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int minute1 = i == 0 ? 1 : 1 + a - i;
                int minute2 = j == 0 ? 1 : 1 + b - j;
                int timer = 0;
                int tcounter1 = 0;
                int tcounter2 = 0;

                while (tcounter1 < n || tcounter2 < m) {
                    if (tcounter1 > n || tcounter2 > m) {
                        break;
                    }
                    timer++;
                    if (timer == minute1) {
                        minute1 += a;
                        tcounter1++;
                    }

                    if (timer == minute2) {
                        minute2 += b;
                        tcounter2++;
                    }
                }

                if (tcounter1 == n && tcounter2 == m) {
                    if (timer < min) {
                        min = timer;
                    }
                    timer = Math.min(minute1, minute2) - 1;
                    if (timer > max) {
                        max = timer;
                    }
                }
            }
        }

        if (max != 0) {
            System.out.println(min + " " + max);
        } else {
            System.out.println("-1");
        }

    }
}