import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = new String[4];
        for (int i = 0; i < 4; i++) {
            String number = sc.nextLine().replaceFirst("\\+7", "8").replaceAll("[()-]", "");
            if (number.length() == 7) {
                number = "8495" + number;
            }
            numbers[i] = number;
        }

        for (int i = 1; i < 4; i++) {
            if (numbers[0].equals(numbers[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
