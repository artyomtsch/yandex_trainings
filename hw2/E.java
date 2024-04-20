import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] values = sc.nextLine().split(" ");

        int size = values.length;

        int[] nums = new int[size];
        int indexOfWinner = 0;
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(values[i]);
            nums[i] = num;
            if (num > nums[indexOfWinner]) {
                indexOfWinner = i;
            }
        }

        if (indexOfWinner == size-1 || indexOfWinner == size-2) {
            System.out.println(0);
            return;
        }

        int vasiliy = 0;
        for (int i = indexOfWinner+1; i < size-1; i++) {
            int cur = nums[i];
            if (cur % 10 == 5 && cur > nums[i+1] && cur > vasiliy) {
                vasiliy = cur;
            }
        }

        if (vasiliy == 0) {
            System.out.println(0);
            return;
        }

        int place = 1;
        for (int val : nums) {
            if (val > vasiliy) {
                place++;
            }
        }

        System.out.println(place);
    }
}