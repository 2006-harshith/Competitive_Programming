import java.util.Scanner;

public class prob_2171A_Shizuku{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int iter=1;iter<=n;iter++){
        int legs=sc.nextInt();
        int count=0;
        for(int i =0; i<legs;i++){
            for(int j=0;j<legs;j++){
                if(2*i+3*j==n){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

        sc.close();
    }
}
