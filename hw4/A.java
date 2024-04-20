import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));

        int n = Integer.parseInt(sc.readLine());
        HashMap<String,String> dict = new HashMap();
        for (int i = 0; i < n; i++) {
            String[] record = sc.readLine().split(" ");
            dict.put(record[0], record[1]);
            dict.put(record[1], record[0]);
        }

        String word = sc.readLine();
        FileWriter writer = new FileWriter("output.txt");
        writer.write(dict.get(word) + "\n");
        writer.flush();
    }
}