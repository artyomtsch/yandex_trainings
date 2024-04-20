import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;
import java.io.File;

public class D {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));

        HashSet<String> hashSet = new HashSet();

        while (sc.hasNext()) {
            String words = sc.nextLine();

            for (String word : words.split("\\s+")) {
                hashSet.add(word);
            }
        }

        System.out.println(hashSet.size());
    }
}