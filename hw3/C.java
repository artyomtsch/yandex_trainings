import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("input.txt"));

        TreeSet<Integer> hashSetN = new TreeSet();
        TreeSet<Integer> treeSetM = new TreeSet();
        TreeSet<Integer> treeSetCross = new TreeSet();

        String[] ln = bfr.readLine().split(" ");
        int N, M;
        N = Integer.parseInt(ln[0]);
        M = Integer.parseInt(ln[1]);

        for (int i = 0; i < N; i++) {
            hashSetN.add(Integer.parseInt(bfr.readLine()));
        }

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(bfr.readLine());
            if (hashSetN.contains(num)) {
                treeSetCross.add(num);
                hashSetN.remove(num);
            } else {
                treeSetM.add(num);
            }
        }

        FileWriter writer = new FileWriter("output.txt");

        writer.write(String.valueOf(treeSetCross.size()) + "\n");
        for (Integer i : treeSetCross) {
            writer.write(String.valueOf(i) + " ");
        }

        writer.write("\n" + String.valueOf(hashSetN.size()) + "\n");
        for (Integer i : hashSetN) {
            writer.write(String.valueOf(i) + " ");
        }

        writer.write("\n" + String.valueOf(treeSetM.size()) + "\n");
        for (Integer i : treeSetM) {
            writer.write(String.valueOf(i) + " ");
        }
        writer.flush();
    }
}