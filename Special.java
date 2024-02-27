import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (i>=10 && i <= 99) {
                int sum = (i/10)+(i%10);
                int pro = (i/10)*(i%10);
                int tot= sum +pro;
                if (tot==i) {
            System.out.println(i);
                }
        }
       
        sc.close();
    }
}}
