import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int row = (a-1)/3;
        int col = (a-1)%3;
        System.out.print(row+" "+col);
        sc.close();
    }
}
