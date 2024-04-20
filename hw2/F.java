import java.util.Scanner;
import java.util.ArrayList;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int left, right;
        if (arr.length % 2 == 0) {
            right = arr.length / 2;
            left = right - 1;
        } else {
            right = arr.length / 2 + 1;
            left = right-2;
        }
        boolean flag = true;
        while (right != arr.length) {
            if (arr[right] != arr[left]) {
                flag = false;
                break;
            }
            right++; left--;
        }

        if (flag) {
            System.out.println(0);
            return;
        }

        ArrayList<Integer> addition = new ArrayList();
        for (int central = arr.length / 2 + 1; central < arr.length; central++) {
            // 1
            right = central;
            left = central - 1;
            while (true) {
                if (right == arr.length) {
                    // ...
                    while (left >= 0) {
                        addition.add(arr[left]);
                        left--;
                    }

                    System.out.println(addition.size());
                    if (addition.size() > 0) {
                        for (int value : addition) {
                            System.out.print(value + " ");
                        }
                    }
                    return;
                }

                if (arr[left] != arr[right]) {
                    break;
                }
                right++;
                left--;
            }

            // 2
            right = central + 1;
            left = central - 1;
            while (true) {
                if (right == arr.length) {
                    // ...
                    while (left >= 0) {
                        addition.add(arr[left]);
                        left--;
                    }

                    System.out.println(addition.size());
                    if (addition.size() > 0) {
                        for (int value : addition) {
                            System.out.print(value + " ");
                        }
                    }
                    return;
                }

                if (arr[left] != arr[right]) {
                    break;
                }
                right++;
                left--;
            }
        }

    }
}