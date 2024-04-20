import java.util.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

public class B {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        HashMap<String, Integer> freqmap = new HashMap();
        FileWriter writer = new FileWriter("output.txt");

        while(sc.hasNext()) {
            String[] words = sc.nextLine().split("\\s+");

            for (String word : words) {
                int freq = freqmap.getOrDefault(word, 0);
                writer.write(freq + " ");
                freqmap.put(word, freq+1);
            }
        }
        writer.flush();
    }
}