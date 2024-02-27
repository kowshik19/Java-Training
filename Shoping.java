import java.util.Scanner;

public class Shoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int fp = (int) (a1 * (a2 * 0.01) + a3);
        int sp = (int) (b1 * (b2 * 0.01) + b3);
        int ap = (int) (c1 * (c2 * 0.01) + c3);
        System.out.println("In Flipkart: Rs." + fp);
        System.out.println("In Snapdeal: Rs." + sp);
        System.out.println("In Amazon: Rs." + ap);
        sc.close();
        if (fp <= sp || fp <= ap) {
            System.out.println("Choose Flipkart");
        } else if (sp <= fp || sp <= ap) {
            System.out.println("Choose Snapdeal");
        } else {
            System.out.println("Choose Amazon");
        }
    }
}
