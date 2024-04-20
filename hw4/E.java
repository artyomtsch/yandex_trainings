import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Map;

public class E {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));

        int N = Integer.parseInt(sc.readLine());
        HashMap<Integer, Integer> blocksmap = new HashMap();

        for (int i = 0; i < N; i++) {
            String[] line = sc.readLine().split(" ");
            int width = Integer.parseInt(line[0]);
            int height = Integer.parseInt(line[1]);

            Integer heightInMap = blocksmap.get(width);
            if (heightInMap == null || height > heightInMap) {
                blocksmap.put(width, height);
            }
        }

        long maxheight = 0L;
        for (Map.Entry<Integer, Integer> entry : blocksmap.entrySet()) {
            maxheight += entry.getValue();
        }

        System.out.println(maxheight);
    }
}