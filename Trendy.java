import java.util.Scanner;

public class Trendy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int three = sc.nextInt();
        int mid = (three / 10) % 10;
        int a = mid%3;
        if (three < 100 || 999 <= three) {
            System.out.println("Invalid Number");
        } else if (a==0) {
            System.out.println("Trendy Number");
        } else {
            System.out.println("Not a Trendy Number");
        }
        sc.close();
    }
}
