import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;

// TL yandex contest fucked

public class F {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        //Scanner sc = new Scanner(System.in);

        TreeMap<String, HashMap<String, Long>> products = new TreeMap();
        TreeSet<String> lastnames = new TreeSet();

        String line;
        while ((line = sc.readLine()) != null) {
            String[] vals = line.split(" ");
            String lastname = vals[0];
            String product = vals[1];
            Long productCount = Long.parseLong(vals[2]);

            lastnames.add(lastname);

            HashMap<String, Long> hm = products.get(product);
            if (hm == null) {
                hm = new HashMap<String, Long>();
                hm.put(lastname, productCount);
            } else {
                hm.put(lastname, hm.getOrDefault(lastname, 0L)+productCount);
            }
            products.put(product, hm);
        }

        FileWriter writer = new FileWriter("output.txt");

        for (String lastname : lastnames) {
            writer.write(lastname + ":\n");

            for (Map.Entry<String, HashMap<String, Long>> entry : products.entrySet()) {
                String product = entry.getKey();
                HashMap<String, Long> map = entry.getValue();
                Long productCount = map.get(lastname);

                if (productCount == null) {
                    continue;
                }

                writer.write(product + " " + productCount + "\n");
            }
        }

        writer.flush();
    }
}