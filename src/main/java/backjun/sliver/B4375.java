package backjun.sliver;

import java.util.Scanner;

public class B4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int cnt = 1, ret = 1;

            while (true) {
                if (cnt % n == 0) {
                    System.out.println(ret);
                    break;
                } else {
                    cnt = (cnt * 10) + 1;
                    cnt %= n;
                    ret++;
                }
            }
        }

        sc.close();
    }
}
