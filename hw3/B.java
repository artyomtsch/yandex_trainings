import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));

        String[] arr = bufferedReader.readLine().split(" ");
        HashSet<Integer> hs1 = new HashSet();
        for (String str : arr) {
            int num = Integer.parseInt(str);
            hs1.add(num);
        }

        arr = bufferedReader.readLine().split(" ");
        TreeSet<Integer> treeSet = new TreeSet();

        for (String str : arr) {
            int num = Integer.parseInt(str);
            if (hs1.contains(num)) {
                treeSet.add(num);
            }
        }

        FileWriter writer = new FileWriter("output.txt");
        for (Integer i : treeSet) {
            writer.write(String.valueOf(i) + " ");
        }
        writer.flush();
    }
}