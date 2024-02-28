import java.util.*;

public class Days {
    public static void main(String[] args) {
        int year, month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        year = sc.nextInt();
        if (1900 <= year && year <= 9999) {
            System.out.println("0");
        }
        if (month < 1 && month > 12)
            System.out.println("0");
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.print("31");
        } else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            {
                System.out.print("29");
            }
        } else if (month == 2) {
            {
                System.out.print("28");
            }
        } else {
            System.out.println("30");
        }
        sc.close();
    }
}