import java.util.Scanner;

public class Addno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = Math.abs(n);
        System.out.println(n%10 + n/1000 );
        sc.close();
    }
}
