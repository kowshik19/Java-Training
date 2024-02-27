import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        if (unit <= 200) {
            System.out.println("Rs."+(int)( unit * 0.5));
        } else if (unit <= 400) {
            System.out.println("Rs."+(int) ((unit * 0.65)+100));
        } else if (unit <= 600) {
            System.out.println("Rs."+(int)((unit * 0.80)+200));
        } else if (unit > 600) {
            System.out.println("Rs."+(int)((unit * 1.25)+425));
        }
        sc.close();

    }
}
