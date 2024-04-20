import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class F {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();

        HashSet<String> set = new HashSet();

        StringBuilder builder = new StringBuilder("AB");
        builder.setCharAt(0, second.charAt(0));

        for (int i = 1; i < second.length(); i++) {
            char ch = second.charAt(i);
            builder.setCharAt(1, ch);
            set.add(builder.toString());
            builder.setCharAt(0, ch);
        }

        int counter = 0;
        builder.setCharAt(0, first.charAt(0));

        for (int i = 1; i < first.length(); i++) {
            char ch = first.charAt(i);
            builder.setCharAt(1, ch);
            if (set.contains(builder.toString())) {
                counter++;
            }
            builder.setCharAt(0, ch);
        }

        System.out.println(counter);
    }
}