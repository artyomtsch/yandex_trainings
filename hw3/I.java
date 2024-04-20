import java.util.Scanner;
import java.io.IOException;
import java.util.HashSet;

public class I {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        HashSet<String> setOfUniqueLangs = new HashSet();
        HashSet<String> setOfCommonLangs = new HashSet();

        int N = Integer.parseInt(sc.nextLine());
        int M = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < M; i++) {
            String lang = sc.nextLine();
            setOfUniqueLangs.add(lang);
            setOfCommonLangs.add(lang);
        }

        for (int i = 1; i < N; i++) {
            M = Integer.parseInt(sc.nextLine());
            HashSet<String> tempset = new HashSet();

            for (int j = 0; j < M; j++) {
                String lang = sc.nextLine();
                setOfUniqueLangs.add(lang);

                if (setOfCommonLangs.contains(lang)) {
                    tempset.add(lang);
                }
            }
            setOfCommonLangs = tempset;
        }

        System.out.println(setOfCommonLangs.size());
        for (String lang : setOfCommonLangs) {
            System.out.println(lang);
        }

        System.out.println(setOfUniqueLangs.size());
        for (String lang : setOfUniqueLangs) {
            System.out.println(lang);
        }
    }
}