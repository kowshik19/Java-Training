import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        System.out.println(n);
        
        while (n != 1) {
            
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
                count++;
            } else {
                n = (n * 3) + 1;
                System.out.println(n);
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
