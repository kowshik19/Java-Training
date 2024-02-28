import java.util.Scanner;

public class Timesheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, g;
        int mon = sc.nextInt();
        int tue = sc.nextInt();
        int wed = sc.nextInt();
        int thu = sc.nextInt();
        int fri = sc.nextInt();
        int sat = sc.nextInt();
        int sun = sc.nextInt();
         f = sat * 125;
         g = sun * 150;
        
        if (mon <= 8) {
            a = mon * 100;
        } else {
            int bonus = mon - 8;
            a = 800 + bonus * 115;
        }
        if (tue <= 8) {
            b = tue * 100;
        } else {
            int bonus = tue - 8;
            b = 800 + bonus * 115;
        }
        if (wed <= 8) {
            c = wed * 100;
        } else {
            int bonus = wed - 8;
            c = 800 + bonus * 115;
        }
        if (thu <= 8) {
            d = thu * 100;
        } else {
            int bonus = thu - 8;
            d = 800 + bonus * 115;
        }
        if (fri <= 8) {
            e = fri * 100;
        } else {
            int bonus = fri - 8;
            e = 800 + bonus * 115;
        }
        System.out.println(a + b + c + d + e + f + g);
        sc.close();
    }
}
