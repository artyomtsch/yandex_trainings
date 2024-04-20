import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double x = Double.parseDouble(sc.nextLine());

        double[] interval = new double[] { 30.0, 4000.0 };

        for (int i = 0; i < n-1; i++) {
            double y = sc.nextDouble();
            String distance = sc.nextLine().trim();

            if (Math.abs(x-y) < Math.pow(10,-6)) {
                continue;
            }

            if (Double.compare(y, x) > 0) {
                if (distance.equals("closer")) {
                    interval[0] = Math.max(interval[0], x + (y-x) / 2);
                } else {
                    interval[1] = Math.min(interval[1], x + (y-x) / 2);
                }
            } else {
                if (distance.equals("closer")) {
                    interval[1] = Math.min(interval[1], y + (x-y) / 2);
                } else {
                    interval[0] = Math.max(interval[0], y + (x-y) / 2);
                }
            }

            x = y;
        }

        System.out.println(String.format("%.6f", interval[0]) + " " + String.format("%.6f", interval[1]));
    }
}