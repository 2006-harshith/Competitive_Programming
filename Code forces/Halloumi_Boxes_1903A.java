import java.util.*;

public class Halloumi_Boxes_1903A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int o = 0; o < t; o++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            // Number written in each boxes. array of n
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (k <= 1) {
                boolean check = true;
                for (int num = 0; num < n - 1; num++) {
                    if (arr[num] > arr[num + 1]) {
                        check = false;
                    } else {
                        continue;
                    }
                }
                if (check) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else if (k >= 2) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}