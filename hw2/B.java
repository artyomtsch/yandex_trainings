import java.util.Scanner;

public class B
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FINISH = -2 * (int)Math.pow(10,9);
        int prev = sc.nextInt();
        int next = sc.nextInt();

        if (next == FINISH) {
            System.out.println("CONSTANT");
            return;
        }

        boolean equal = false;
        boolean ascending = false;
        boolean descending = false;

        while (next != FINISH) {
            if (prev == next) {
                equal = true;
            } else if (next < prev && !ascending) {
                descending = true;
            } else if (next > prev && !descending) {
                ascending = true;
            } else {
                System.out.println("RANDOM");
                return;
            }

            prev = next;
            next = sc.nextInt();
        }

        if (equal) {
            if (ascending) {
                System.out.println("WEAKLY ASCENDING");
            } else if (descending) {
                System.out.println("WEAKLY DESCENDING");
            } else {
                System.out.println("CONSTANT");
            }
        } else {
            if (ascending) {
                System.out.println("ASCENDING");
            } else {
                System.out.println("DESCENDING");
            }
        }
    }
}
