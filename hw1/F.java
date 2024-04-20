import java.util.Scanner;

public class F
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");

        int a1 = Integer.parseInt(values[0]);
        int b1 = Integer.parseInt(values[1]);
        int a2 = Integer.parseInt(values[2]);
        int b2 = Integer.parseInt(values[3]);

        int a = a1+a2;
        int b = Math.max(b1,b2);
        int area = a*b;
        if (area > (a1+b2)*Math.max(a2,b1)) {
            a = a1+b2;
            b = Math.max(a2,b1);
            area = a*b;
        }
        if (area > (a2+b1)*Math.max(a1,b2)) {
            a = a2+b1;
            b = Math.max(a1,b2);
            area = a*b;
        }
        if (area > (b1+b2)*Math.max(a1,a2)) {
            a  = b1+b2;
            b = Math.max(a1,a2);
        }
        System.out.println(a + " " + b);
    }
}
