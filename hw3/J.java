import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;

// TL

public class J {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));

        int t,d,n;
        String[] line = sc.readLine().split(" ");
        t = Integer.parseInt(line[0]);
        d = Integer.parseInt(line[1]);
        n = Integer.parseInt(line[2]);

        HashSet<List<Integer>> setOfPoints = new HashSet();
        setOfPoints.add(List.of(0,0));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                int[] offsetX = new int[] {-1, 1, 0, 0};
                int[] offsetY = new int[] {0, 0, -1, 1};
                HashSet<List<Integer>> tempset = new HashSet();

                for (List<Integer> point : setOfPoints) {
                    tempset.add(point);
                    for (int k = 0; k < offsetX.length; k++) {
                        int x = point.get(0) + offsetX[k];
                        int y = point.get(1) + offsetY[k];
                        tempset.add(List.of(x, y));
                    }
                }
                setOfPoints = tempset;
            }

            line = sc.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);

            Iterator<List<Integer>> iterator = setOfPoints.iterator();
            while (iterator.hasNext()) {
                List<Integer> point = iterator.next();
                if (Math.abs(x-point.get(0)) + Math.abs(y-point.get(1)) > d) {
                    iterator.remove();
                }
            }
        }

        FileWriter writer = new FileWriter("output.txt");
        writer.write(setOfPoints.size() + "\n");
        for (List<Integer> point : setOfPoints) {
            writer.write(point.get(0) + " " + point.get(1) + "\n");
        }
        writer.flush();
    }
}