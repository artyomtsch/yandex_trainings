import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));

        HashMap<String, Integer> freqmap = new HashMap();

        int maxfreq = 0;
        String ans = "";
        String line;

        while((line = sc.readLine()) != null) {
            String[] words = line.split("\\s+");

            for (String word : words) {
                int freq = freqmap.getOrDefault(word, 0) + 1;
                freqmap.put(word, freq);

                if (freq > maxfreq) {
                    ans = word;
                    maxfreq = freq;
                } else if (freq == maxfreq && word.compareTo(ans) < 0) {
                    ans = word;
                }
            }
        }
        System.out.println(ans);
    }
}