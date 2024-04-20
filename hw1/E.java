import java.util.Scanner;
import java.util.ArrayList;

// WA
public class E
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        int kv1 = Integer.parseInt(values[0]);
        int etazhnost = Integer.parseInt(values[1]);
        int kv2 = Integer.parseInt(values[2]);
        int pod2 = Integer.parseInt(values[3]);
        int etazh2 = Integer.parseInt(values[4]);

        evaluate(kv1, etazhnost, kv2, pod2, etazh2);
    }

    static void evaluate(int kv1, int etazhnost, int kv2, int pod2, int etazh2) {
        if (kv1 < (pod2-1)*etazhnost+etazh2) {
            System.out.println("-1 -1");
            return;
        }

        if (kv1 == kv2) {
            System.out.println("" + pod2 + " " + etazh2);
        }

        if (pod2 == 1 && etazh2 == 1) {
            if (kv1 > kv2) {
                int etazh1 = etazhnost == 1 ? 1 : 0;
                System.out.println("0 " + etazh1);
                return;
            } else {
                System.out.println("1 1");
                return;
            }
        }

        int etazheiPod = (pod2-1) * etazhnost + etazh2-1;
        ArrayList<Integer> kvartirNaEtazhe = new ArrayList();
        int kvartira = kv2-1;
        while (kvartira >= etazheiPod) {
            if (kvartira % etazheiPod == 0) {
                //
                int kvNaEtazhe = kvartira / etazheiPod;
                if (kv2 > kvNaEtazhe*etazheiPod && kv2 <= kvNaEtazhe*(etazheiPod+1)) {
                    kvartirNaEtazhe.add(kvNaEtazhe);
                } else {
                    break;
                }
            }
            kvartira--;
        }

        if (kvartirNaEtazhe.size() == 0) {
            System.out.println("-1 -1");
            return;
        }

        if (kvartirNaEtazhe.size() == 1) {
            int etazheiPod1 = kv1 / kvartirNaEtazhe.get(0);
            int pod1 = etazheiPod1 / etazhnost + 1;
            int etazh1 = etazheiPod1 + 1 - etazhnost*(pod1-1);
            System.out.println("" + pod1 + " " + etazh1);
            return;
        } else {
            int etazheiPod1 = kv1 / kvartirNaEtazhe.get(0);
            int pod1 = etazheiPod1 / etazhnost + 1;
            int etazh1 = etazheiPod1 + 1 - etazhnost*(pod1-1);

            for (int value : kvartirNaEtazhe) {
                etazheiPod1 = (int)Math.ceil((float)kv1 / value) - 1;
                int pod1Local = etazheiPod1 / etazhnost + 1;
                int etazh1Local = etazheiPod1 + 1 - etazhnost*(pod1-1);

                if (pod1Local != pod1) {
                    pod1 = 0;
                }
                if (etazh1Local != etazh1) {
                    etazh1 = 0;
                }
            }

            System.out.println("" + pod1 + " " + etazh1);
        }
    }
}