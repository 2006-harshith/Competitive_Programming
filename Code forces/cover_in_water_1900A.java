import java.util.*;

public class cover_in_water_1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {

            int n = sc.nextInt();
            String s = sc.next();
            int water = 0;
            int var = 0;
            for (int i = 0; i < n; i++) {
                if (var <= 2) {
                    if (s.charAt(i) == '.') {
                        if (i == (s.length() - 1)) {
                            var+=1;
                            water += var;
                        } 
                        else {
                            var += 1;
                        }
                    }
                    else {
                        water += var;
                        var = 0;
                    }
                }
                if (var == 3) {
                    water = 2;
                    break;
                }
            }
            System.out.println(water);

        }
        sc.close();

    }
}
