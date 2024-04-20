import java.util.Scanner;

// WA

public class G
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");

        if (values.length == 2) {
            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            System.out.println(Math.min(a,b) + " " + Math.max(a,b));
            return;
        }

        int neg1, neg2;
        neg1 = neg2 = 1;
        int pos1, pos2;
        pos1 = pos2 = -1;

        for (String value : values) {
            int cur = Integer.parseInt(value);

            if (cur >= 0 && cur > pos1) {
                pos2 = pos1;
                pos1 = cur;
            } else if (cur >= 0 && cur > pos2) {
                pos2 = cur;
            } else if (cur < 0 && cur < neg1) {
                neg2 = neg1;
                neg1 = cur;
            } else if (cur < 0 && cur < neg2) {
                neg2 = cur;
            }
        }

        long product1 = pos1*pos2*1L;
        long product2 = neg1*neg2*1L;
        if (product1 >= product2) {
            System.out.println(Math.min(pos1,pos2) + " " + Math.max(pos1,pos2));
        } else {
            System.out.println(Math.min(neg1,neg2) + " " + Math.max(neg1,neg2));
        }
    }
}