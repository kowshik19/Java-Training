import java.util.Scanner;

public class Amibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
    int c=0;
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        for (int i = 3; i <= month; i++) {

            c = a + b;
            a = b;
            b = c;
            
        }System.out.println(c);
        sc.close();
    }
}
