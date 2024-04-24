import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int g, S;
        String[] line = bufferedReader.readLine().split(" ");
        g = Integer.parseInt(line[0]);
        S = Integer.parseInt(line[1]);

        String word = bufferedReader.readLine();
        String phrase = bufferedReader.readLine();

        HashMap<Character, Integer> curmap = new HashMap();

        for (char c : word.toCharArray()) {
            curmap.put(c, curmap.getOrDefault(c, 0) + 1);
        }

        int right = 0;
        int length = 0;
        int ans = 0;

        for (int left = 0; left <= phrase.length()-g; left++) {
            char leftLetter = phrase.charAt(left);

            while (length < g) {
                char rightLetter = phrase.charAt(right);
                Integer rem = curmap.get(rightLetter);

                if (rem == null) {
                    while (left != right) {
                        curmap.put(phrase.charAt(left), curmap.get(phrase.charAt(left)) + 1);
                        left++;
                    }
                    right++;
                    length = 0;
                    break;
                }
                else if (rem == 0) {
                    curmap.put(leftLetter, curmap.get(leftLetter) + 1);
                    length--;
                    break;
                }
                else {
                    curmap.put(rightLetter, rem-1);
                    right++;
                    length++;
                }
            }

            if (length == g) {
                ans++;
                length--;
                curmap.put(leftLetter, 1);
            }
        }

        System.out.println(ans);
    }
}
