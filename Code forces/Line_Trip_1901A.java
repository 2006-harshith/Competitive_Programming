import java.util.Scanner;

public class Line_Trip_1901A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] points = new int[n + 2];

            points[0] = 0;
            points[n + 1] = x;

            for (int j = 1; j < n + 1; j++) {
                points[j] = sc.nextInt();
            }

            int min = 0;
            for (int j = 0; j < n; j++) {
                if (points[j + 1] - points[j] > min) {
                    min = points[j + 1] - points[j];
                }
            }
            if ((points[n + 1] - points[n]) * 2 > min) {
                min = (points[n + 1] - points[n]) * 2;
            }

            System.out.println(min);

        }
        sc.close();
        
    }
}
