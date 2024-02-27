import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int month= sc.nextInt();
        int rent=sc.nextInt();
        int day=sc.nextInt();
        if (month==4 || month == 6 || month ==11||month==12) {
            System.out.println((int)(((rent*0.2)+rent)*day));
        } else if (month<=12 && month >=1){
            System.out.println(rent*day);
           
        }else {
            System.out.println("Invalid Input"); 
        }
        sc.close();
    }
}
