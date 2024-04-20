import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        HashSet<Integer> hs = new HashSet(Arrays.asList(arr));

        System.out.println(hs.size());
    }
}