import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileWriter;

public class G {
    private static void changeBalance(HashMap<String, Integer> clients, String client, Integer sum) {
        clients.put(client, clients.getOrDefault(client, 0) + sum);
    }

    private static void dumpBalance(FileWriter writer, HashMap<String, Integer> clients, String client) throws IOException {
        Integer balance;
        if ((balance = clients.get(client)) == null) {
            writer.write("ERROR\n");
        } else {
            writer.write(balance + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new FileReader("input.txt"));
        FileWriter writer = new FileWriter("output.txt");

        HashMap<String, Integer> clients = new HashMap();
        String line;

        while ((line = sc.readLine()) != null) {
            String[] record = line.split(" ");
            String operation = record[0];

            switch(operation) {
                case "DEPOSIT": {
                    Integer sum = Integer.parseInt(record[2]);
                    changeBalance(clients, record[1], sum);
                    break;
                }
                case "WITHDRAW": {
                    Integer sum = Integer.parseInt(record[2]);
                    changeBalance(clients, record[1], -sum);
                    break;
                }
                case "TRANSFER": {
                    Integer sum = Integer.parseInt(record[3]);
                    changeBalance(clients, record[1], -sum);
                    changeBalance(clients, record[2], sum);
                    break;
                }
                case "INCOME": {
                    int percent = Integer.parseInt(record[1]);
                    clients.replaceAll((k,v) -> v = v > 0 ? v+v*percent / 100 : v);
                    break;
                }
                case "BALANCE": {
                    dumpBalance(writer, clients, record[1]);
                    break;
                }
            }
        }
        writer.flush();
    }
}